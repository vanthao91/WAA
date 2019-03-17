package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Place {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	private String placeID;
	private String placeName;
	
	@OneToMany(mappedBy = "place", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<MeditationRecord> meditationRecord;
	
	public String getPlaceID() {
		return placeID;
	}
	
	public void setPlaceID(String placeID) {
		this.placeID = placeID;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Set<MeditationRecord> getMeditationRecord() {
		return meditationRecord;
	}

	public void setMeditationRecord(Set<MeditationRecord> meditationRecord) {
		this.meditationRecord = meditationRecord;
	}
}
