package com.example.demo.domain;

import java.util.Set;

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
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "student_id")
    private Set<Student> student;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "courseBlockFaculty_id")
    private Set<Course_Block_Faculty> courseBlockFaculty;
    
	private Boolean active;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

    public Set<Course_Block_Faculty> getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Set<Course_Block_Faculty> courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}
	
}
