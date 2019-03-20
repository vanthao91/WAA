package com.example.demo.repository;

import com.example.demo.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
//    Attendance findByAttendanceID()

}
