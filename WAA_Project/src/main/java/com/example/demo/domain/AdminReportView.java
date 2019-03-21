package com.example.demo.domain;

public class AdminReportView {
	private Student student;
	private Double totalSessionsPossible;
	private Double totalSessionsAttended;
	private String percent;
	private Double extraPoint;
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public Double getTotalSessionsPossible() {
		return totalSessionsPossible;
	}

	public void setTotalSessionsPossible(Double totalSessionsPossible) {
		this.totalSessionsPossible = totalSessionsPossible;
	}

	public Double getTotalSessionsAttended() {
		return totalSessionsAttended;
	}

	public void setTotalSessionsAttended(Double totalSessionsAttended) {
		this.totalSessionsAttended = totalSessionsAttended;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public Double getExtraPoint() {
		return extraPoint;
	}

	public void setExtraPoint(Double extraPoint) {
		this.extraPoint = extraPoint;
	}
}
