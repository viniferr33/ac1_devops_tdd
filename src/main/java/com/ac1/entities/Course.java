package com.ac1.entities;

public class Course {
	public String name;
	public Boolean finished;
	public Double grade;
	
	public Course(String name, Boolean finished, Double grade) {
		super();
		this.name = name;
		this.finished = finished;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getFinished() {
		return finished;
	}
	
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	
	public Double getGrade() {
		return grade;
	}
	
	public void setGrade(Double grade) {
		this.grade = grade;
	}
}
