package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {
	private String studentID;	
	
	@OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<MeditationRecord> meditationRecord;
	
	@OneToMany(mappedBy = "student")
    private Set<Student_Course> studentCourse;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
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
