$(document).ready(function() {

	console.log("--------oo");
	$("#submitNewUserBtn").click(function(event) {
		event.preventDefault();
		console.log('------');

		makeAjaxCall();
	})

});
// pathname is contextRoot/path/path/ so we want to get [1]
// that is where contextRoot is
// [0] has "" as a result of split
var contextRoot = "/" + window.location.pathname.split('/')[1];

// Translate form to array
// Then put in JSON format
function serializeObject(form) {
	var jsonObject = {};
	var array = form.serializeArray();
	// console.log(array);
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;

};

function serializeObject2(form) {
	var o = {};
	var a = form.serializeArray();
	$.each(a, function() {
		// console.log(this.name + '--' + this.value);
		if (this.name == 'person') {
			var obj = {id: this.value};
			o[this.name] = obj;
		} else if (this.name == 'roles') {
			var obj = {id: this.value};
			if (o[this.name]) {
				o[this.name].push(obj);
			} else {
				o[this.name] = [obj];
			}
		} else{
			o[this.name] = this.value || '';
		}

		console.log(o);
	});
	return o;
}

function makeAjaxCall() {
	var dataToSend = JSON.stringify(serializeObject2($('#registrationForm')));
	console.log(dataToSend);
	// {"username":"tamphan","password":"qq","active":"true","_active":"on","_roles":"1","roles":"2","person":"1"}
//	dataToSend = '{"username":"tamphan","password":"jj","active":"true","_active":"on","roles": [{"id":"1"},{"id":"2"}],"person":{"id":1}}';

	$.ajax({
		type : 'POST',
		url : '/rest/registration',
		dataType : "json", // Accept header
		data : dataToSend,
		contentType : 'application/json', // Sends - Content-type
		success : function(user) {
			$('#errors').html("");
			$("#result").html("");
			$("<h3/>", {
				html : $("#username").val() + " has been created successfully!!",
				align : "center"
			}).appendTo($("#result"));

			$('#result').show();
		},
		error : function(errorObject) {
			console.log(errorObject);
			console.log(errorObject.responseText);
			if (errorObject.responseJSON.errorType == "ValidationError") {
				$('#success').html("");
				$('#errors').html("");
				console.log("+++++++++++");
				$("<h3/>", {
					html : "Error(s)!!",
					align : "center"
				}).appendTo($("#errors"));

				var errorList = errorObject.responseJSON.errors;

				var errMsg = '';

				$.each(errorList, function(i, error) {
					errMsg += (error.message + '<br />');
				});

				$("<p/>", {
					html : errMsg
				}).appendTo($("#errors"));

				$('#result').show();

			} else {
				alert(errorObject.responseJSON.errors(0)); // "non" Validation
				// Error
			}
		}
	});

}
