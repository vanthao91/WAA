package com.example.demo.service.studentAttendanceService;


import com.example.demo.domain.Student_Course;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AttendanceServiceImpl implements AttendanceService{
    @Override
    public List<Student_Course> createAttendanceReportForBlock(String blockStartDate) {

        return null;
    }

    @Override
    public void countAttendanceANdCalculateThePercentage() {

    }
}
