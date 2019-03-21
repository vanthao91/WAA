package com.example.demo.controller;

import com.example.demo.domain.BlocksToDisplay;
import com.example.demo.domain.CourseToDisplay;
import com.example.demo.service.AttendanceService;
import com.example.demo.service.BlocksToDisplayService;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class StudentController {

	@Autowired
	private BlocksToDisplayService blockService;

	@Autowired
	private CourseService courseService;

	@Autowired
	private AttendanceService attendanceService;

	@RequestMapping(value = "/block/student/{studentId}/{blockid}")
	public String facultyCourseList(@PathVariable("studentId") String studentId,
									@PathVariable("blockid") long cofferingid, Model model) {

		List<BlocksToDisplay> blocks = blockService.findallBlocks();



		model.addAttribute("blockList", blocks);
		return "attendance/studentBlockList";
	}


	@RequestMapping(value = "/course/student/{studentId}/{courseid}", method = RequestMethod.GET)
	public String facultyBlock(@PathVariable("studentId") String studentId,
							   @PathVariable("courseid") long cofferingid, Model model) {

		List<CourseToDisplay> courses = courseService.findallCourse();

		model.addAttribute("courseList", courses);
		return "attendance/studentCourseList";
	}


	@RequestMapping(value = "/attendance/student/{studentId}/{cofferingid}", method = RequestMethod.GET)
	public String getAttendanceRecordsStudent(@PathVariable("studentId") String studentId,
											  @PathVariable("cofferingid") long cofferingid, Model model) {


		return "attendance/studentAttendanceList";
	}
}
