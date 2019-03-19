package com.example.demo.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BlockSession {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "block_id")
	private Block block;
	private Date session;
	
    @OneToMany(mappedBy = "blockSession")
    private Set<MeditationRecord> meditationRecord;
	
	public Block getBlock() {
		return block;
	}
	
	public void setBlock(Block block) {
		this.block = block;
	}

	public Date getSession() {
		return session;
	}

	public void setSession(Date session) {
		this.session = session;
	}

	public Set<MeditationRecord> getMeditationRecord() {
		return meditationRecord;
	}

	public void setMeditationRecord(Set<MeditationRecord> meditationRecord) {
		this.meditationRecord = meditationRecord;
	}
}
