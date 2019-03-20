package com.example.demo.repository;

import com.example.demo.domain.CourseToDisplay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseToDisplay, Long> {
}
