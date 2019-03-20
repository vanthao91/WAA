package com.example.demo.service;

import com.example.demo.domain.Attendance;

import java.util.Date;
import java.util.HashMap;

public interface AttendanceService {
    Attendance findAttendanceByID(Long attendanceID);
    HashMap<Date, Boolean> findInfofromAttendance(Long attendanceID);
}

