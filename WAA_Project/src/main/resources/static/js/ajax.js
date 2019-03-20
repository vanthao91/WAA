$( document ).ready(function(){
	
	
	console.log("--------oo");
	$("#submitNewUserBtn").click(function(event){
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
//	console.log(array);
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;
};


function makeAjaxCall(){
	 
		//var dataToSend = JSON.stringify(serializeObject($('#registrationForm')));
		var dataToSend = JsonConvert.SerializeObject($('#registrationForm'));
		
		$.ajax({
			type : 'POST',
			url : '/admin/rest/registration',
			dataType : "json", // Accept header
			data : dataToSend,
			contentType : 'application/json', // Sends - Content-type
			success : function(user) {
				$('#errors').html("");
				$("#result").html("");
				$( "<h3/>", {
				    html: user.username,
				    align: "center"
				}).appendTo($("#result"));
				
				$('#result').show();
			},
			error : function(errorObject) {
				console.log(errorObject);
				console.log(errorObject.responseText);
				if (errorObject.responseJSON.errorType == "ValidationError") {
					$('#success').html("");
					$('#errors').html("");					
					$( "<h3/>", {
					    html: "Error(s)!!",
					    align: "center"
					}).appendTo($("#errors"));

					var errorList = errorObject.responseJSON.errors;
					
					var errMsg = '';
					
					$.each(errorList, function(i, error) {
						errMsg += (error.message + '<br />');
					});
					
					$("<p/>", {
						html: errMsg
					}).appendTo($("#errors"));
					
					$('#result').show();
					
				} else {
					alert(errorObject.responseJSON.errors(0)); // "non" Validation
					// Error
				}
			}
		});
		
	

	}

