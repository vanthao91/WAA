package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeTM {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	private String typeID;
	private String typeName;
	
	private String fromTime;
	
	private String toTime;
	
	@OneToMany(mappedBy = "typeTM", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<MeditationRecord> meditationRecord;
	
	public String getTypeID() {
		return typeID;
	}
	
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public Set<MeditationRecord> getMeditationRecord() {
		return meditationRecord;
	}

	public void setMeditationRecord(Set<MeditationRecord> meditationRecord) {
		this.meditationRecord = meditationRecord;
	}
}
