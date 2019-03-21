package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Faculty;

public interface CourseBlockFacultyService {
	List<Course_Block_Faculty> findByFaculty(Faculty faculty);
	Course_Block_Faculty getById (Integer id);
}
