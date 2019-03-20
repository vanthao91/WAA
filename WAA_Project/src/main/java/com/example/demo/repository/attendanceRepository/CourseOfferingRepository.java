package com.example.demo.repository.attendanceRepository;


import com.example.demo.domain.Course;
import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;


@Repository("courseOfferingRepository")
public interface CourseOfferingRepository extends JpaRepository<Course_Block_Faculty, Integer> {
	List<Course_Block_Faculty> findByStartDate(Date startDate);

	List<Course_Block_Faculty> findByCourse(Course course);

	Course_Block_Faculty findById(long id);

	List<Course_Block_Faculty> findByFaculty(Faculty course);

}
