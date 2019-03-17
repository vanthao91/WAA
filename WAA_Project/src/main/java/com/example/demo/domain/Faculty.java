package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Faculty extends Person {
	private String barCode;
	private String facultyNumber;
	
	@OneToMany(mappedBy = "faculty", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Course_Block_Faculty> courseBlockFaculty;
	
	public String getBarCode() {
		return barCode;
	}
	
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public Set<Course_Block_Faculty> getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Set<Course_Block_Faculty> courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}
	
}
