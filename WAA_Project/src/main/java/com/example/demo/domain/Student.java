package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {
	private String barCode;
	private String studentID;	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_block_faculty_id"))
    private Set<Course_Block_Faculty> courseBlockFaculty;
	
	@OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<MeditationRecord> meditationRecord;
	
	@OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Student_Course> studentCourse;
	
	public String getBarCode() {
		return barCode;
	}
	
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Set<Course_Block_Faculty> getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Set<Course_Block_Faculty> courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}

	public Set<MeditationRecord> getMeditationRecord() {
		return meditationRecord;
	}

	public void setMeditationRecord(Set<MeditationRecord> meditationRecord) {
		this.meditationRecord = meditationRecord;
	}

	public Set<Student_Course> getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(Set<Student_Course> studentCourse) {
		this.studentCourse = studentCourse;
	}
}
