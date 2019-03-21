package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Faculty;
import com.example.demo.repository.CourseBlockFacultyRepository;
import com.example.demo.service.CourseBlockFacultyService;

@Service
public class CourseBlockFacultyServiceImpl implements CourseBlockFacultyService {

	@Autowired
	private CourseBlockFacultyRepository courseBlockFacultyRepository;
	
	@Override
	public List<Course_Block_Faculty> findByFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return courseBlockFacultyRepository.findByFaculty(faculty);
	}

	@Override
	public Course_Block_Faculty getById(Integer id) {
		// TODO Auto-generated method stub
		return courseBlockFacultyRepository.getOne(id);
	}

}
