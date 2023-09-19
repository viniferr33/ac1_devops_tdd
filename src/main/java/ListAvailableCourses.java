import java.util.ArrayList;
import java.util.List;

import com.ac1.entities.Student;

import repository.CourseRepository;

public class ListAvailableCourses {
	private CourseRepository courseRepository;
	
	public ListAvailableCoursesOutput execute(Student student) {
		return new ListAvailableCoursesOutput();
	}

	public CourseRepository getCourseRepository() {
		return courseRepository;
	}

	public void setCourseRepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
}
