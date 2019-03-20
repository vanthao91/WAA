package com.example.demo.repository.attendanceRepository;

import com.example.demo.domain.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("facultyRepository")
public interface FacultyRepository extends CrudRepository<Faculty, Integer> {
	Faculty findById(Long id);

}
