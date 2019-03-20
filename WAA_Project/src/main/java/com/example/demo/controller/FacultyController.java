package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FacultyController {


	@RequestMapping(value = "/faculty/courseList")
	public String facultyCourseList(Model model, Authentication authentication) {

//		List<Course_Block_Faculty> courseOfferingList = courseService.getCourseOfferingsPastSixMonths(facultyId);

//		model.addAttribute("courseOfferingList", courseOfferingList);
		return "attendance/facultyCourseList";
	}
}
