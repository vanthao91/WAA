package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Faculty;

@Repository
public interface CourseBlockFacultyRepository extends JpaRepository<Course_Block_Faculty, Integer> {
	List<Course_Block_Faculty> findByFaculty(Faculty faculty);
}
