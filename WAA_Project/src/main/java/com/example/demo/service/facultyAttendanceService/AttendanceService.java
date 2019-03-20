package com.example.demo.service.facultyAttendanceService;


import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Student_Course;

import java.util.List;

public interface AttendanceService {


	List<Student_Course> createAttendanceReportForBlock(String blockStartDate);

	List<Student_Course> createAttendanceReportForCourseOffering(Course_Block_Faculty courseOffering);

	List<Student_Course> retrieveStudentAttendanceRecords(Course_Block_Faculty courseOffering);

	void createAttendanceReportForEntry(String entryDate);

	void countAttendancePerDay();
	//	void createAttendanceReportForEntries(String startDate);

}
