package service;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAvailableCoursesOutput {
	public List<String> availableCourses;
	public Integer availableCoursesNum;
	public ListAvailableCoursesOutput(List<String> availableCourses, Integer availableCoursesNum) {
		this.availableCourses = availableCourses;
		this.availableCoursesNum = availableCoursesNum;
	}
	public ListAvailableCoursesOutput() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getAvailableCourses() {
		return availableCourses;
	}
	public void setAvailableCourses(List<String> availableCourses) {
		this.availableCourses = availableCourses;
	}
	public Integer getAvailableCoursesNum() {
		return availableCoursesNum;
	}
	public void setAvailableCoursesNum(Integer availableCoursesNum) {
		this.availableCoursesNum = availableCoursesNum;
	}
	
	
}
