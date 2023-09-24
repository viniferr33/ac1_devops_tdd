package service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import entity.Course;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateStudentOutput {
	public int Id;
	public String Name;
	public String RA;
	public List<Course> courseList;

	public CreateStudentOutput(int id, String name, String rA, List<Course> courseList) {
		Id = id;
		Name = name;
		RA = rA;
		this.courseList = courseList;
	}

}
