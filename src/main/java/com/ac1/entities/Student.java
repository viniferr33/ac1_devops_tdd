package com.ac1.entities;

import java.util.List;

public class Student {
	public String RA;
	public String Name;
	public List<Course> courseList;
	public Subscription subscription;
	
	public Student(String rA, String name, List<Course> courseList) {
		RA = rA;
		Name = name;
		this.courseList = courseList;
	}
	
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}
