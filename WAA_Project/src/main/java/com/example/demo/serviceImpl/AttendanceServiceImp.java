package com.example.demo.serviceImpl;

import com.example.demo.domain.Attendance;
import com.example.demo.repository.AttendanceRepository;
import com.example.demo.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


@Service
public class AttendanceServiceImp implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;


    @Override
    public Attendance findAttendanceByID(Long attendanceID) {
        List<Attendance> attendance = attendanceRepository.findAll();
        Attendance att = attendance.get(1);
        return att;
    }

    @Override
    public HashMap<Date, Boolean> findInfofromAttendance(Long attendanceID) {

        Attendance attendance = findAttendanceByID(attendanceID);
        return attendance.getAttendanceDates();
    }
}
