package com.example.demo.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Block {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;

	private String blockName;
	private Date beginDate;
	private Date endDate;
	
	@OneToMany(mappedBy = "block", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Course_Block_Faculty> courseBlockFaculty;
    
    @OneToMany(mappedBy = "block")
    private Set<BlockSession> blockSession;
	
	public String getBlockName() {
		return blockName;
	}
	
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<Course_Block_Faculty> getCourseBlockFaculty() {
		return courseBlockFaculty;
	}

	public void setCourseBlockFaculty(Set<Course_Block_Faculty> courseBlockFaculty) {
		this.courseBlockFaculty = courseBlockFaculty;
	}

	public Set<BlockSession> getBlockSession() {
		return blockSession;
	}

	public void setBlockSession(Set<BlockSession> blockSession) {
		this.blockSession = blockSession;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
