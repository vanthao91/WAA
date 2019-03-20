package com.example.demo.controller;


import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class StudentAttendanceController {



	@RequestMapping(value = "/my/courselist")
	public String getStudentCourseList(String studentid, Model model, Authentication authentication) {

		return "attendance/studentCourseList";
	}

	@RequestMapping(value = "/my/attendance")
	public String getStudentAttendanceforAcourse(String offeringid, String studentid, Model model) {

		return "studentAttendance";
	}

	@RequestMapping(value = "/attendance/student/{studentId}/{cofferingid}", method = RequestMethod.GET)
	public String getAttendanceRecordsStudent(@PathVariable("studentId") String studentId,
											  @PathVariable("cofferingid") long cofferingid, Model model, Authentication authentication) {


		return "attendance/studentCourseOfferingAttendance";
	}



}
