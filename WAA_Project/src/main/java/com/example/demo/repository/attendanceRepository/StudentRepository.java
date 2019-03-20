package com.example.demo.repository.attendanceRepository;


import com.example.demo.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	List<Student> findByEntryDate(Date entryDate);

	Student findBystudentId(String id);

	List<Student> findAll();

}
