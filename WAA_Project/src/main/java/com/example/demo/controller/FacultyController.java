package com.example.demo.controller;

import com.example.demo.domain.Attendance;
import com.example.demo.domain.BlocksToDisplay;
import com.example.demo.domain.CourseToDisplay;
import com.example.demo.service.AttendanceService;
import com.example.demo.service.BlockService;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class FacultyController {

	@Autowired
	private BlockService blockService;

	@Autowired
	private CourseService courseService;

	@Autowired
	private AttendanceService attendanceService;

	@RequestMapping(value = "/faculty/blockList")
	public String facultyCourseList(Model model, Authentication authentication) {

		List<BlocksToDisplay> blocks = blockService.findallBlocks();


		model.addAttribute("blockList", blocks);
		return "attendance/facultyBlockList";
	}


	@RequestMapping(value = "/faculty/courseList")
	public String facultyBlock(Model model, Authentication authentication) {

		List<CourseToDisplay> courses = courseService.findallCourse();

		model.addAttribute("courseList", courses);
		return "attendance/facultyCourseList";
	}

	@RequestMapping(value = "/faculty/courseList/{id}")
	public String facultyAttendance(@PathVariable Long id,  Model model) {

		Attendance attendance = attendanceService.findAttendanceByID(id);

		model.addAttribute("attendances", attendance);
		return "attendance/facultyAttendanceList";
	}
}
