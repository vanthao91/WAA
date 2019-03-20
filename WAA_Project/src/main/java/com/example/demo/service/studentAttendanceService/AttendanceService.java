package com.example.demo.service.studentAttendanceService;


import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Student_Course;

import java.util.List;

public interface AttendanceService {

	List<Student_Course> createAttendanceReportForBlock(String blockStartDate);

	void countAttendanceANdCalculateThePercentage();

}
