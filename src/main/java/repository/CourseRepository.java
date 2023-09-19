package repository;

import java.util.List;

import com.ac1.entities.Course;

public class CourseRepository {
	private List<String> allCourses;

	public CourseRepository(List<String> allCourses) {
		super();
		this.allCourses = allCourses;
	}

	public List<String> getAllCourses() {
		return allCourses;
	}

	public void setAllCourses(List<String> allCourses) {
		this.allCourses = allCourses;
	}
}
