package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Course;

public class CourseRepository {
	private ArrayList<String> allCourses;

	public CourseRepository(ArrayList<String> allCourses) {
		super();
		this.allCourses = allCourses;
	}

	public ArrayList<String> getAllCourses() {
		return allCourses;
	}

	public void setAllCourses(ArrayList<String> allCourses) {
		this.allCourses = allCourses;
	}
}
