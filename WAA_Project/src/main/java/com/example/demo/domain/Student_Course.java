package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student_Course {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private Student student;

//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseBlockFaculty_id")
    private Course_Block_Faculty courseBlockFaculty;
    
	private Boolean active;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

    public Course_Block_Faculty getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Course_Block_Faculty courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}
	
}
