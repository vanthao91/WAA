package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Faculty extends Person {
	private String facultyID;
	
	@OneToMany(mappedBy = "faculty", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Course_Block_Faculty> courseBlockFaculty;
	
	public String getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}

	public Set<Course_Block_Faculty> getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Set<Course_Block_Faculty> courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}
	
}
