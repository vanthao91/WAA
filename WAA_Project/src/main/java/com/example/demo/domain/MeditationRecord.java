package com.example.demo.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MeditationRecord {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "blockSession_id")
	private BlockSession blockSession;
	
	private Date date;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "place_id")
	private Place place;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "typeTM_id")
	private TypeTM typeTM;
	
	public BlockSession getBlockSession() {
		return blockSession;
	}
	
	public void setgetBlockSession(BlockSession blockSession) {
		this.blockSession = blockSession;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public TypeTM getTypeTM() {
		return typeTM;
	}

	public void setTypeTM(TypeTM typeTM) {
		this.typeTM = typeTM;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
