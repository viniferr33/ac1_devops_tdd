package service;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.Student;
import repository.CourseRepository;

public class ListAvailableCourses {
	private CourseRepository courseRepository;

	public ListAvailableCoursesOutput execute(Student student) {
		System.out.println();
		System.out.println(student.getName());

		ArrayList<String> allCourses = this.courseRepository.getAllCourses();
		List<Course> studentCourses = student.getCourseList();
		Integer numCourses = 0;
		ListAvailableCoursesOutput output = new ListAvailableCoursesOutput();

		if (studentCourses.size() == 0) {
			output.setAvailableCourses(allCourses);
			output.setAvailableCoursesNum(1);

			return output;
		}

		for (Course course : studentCourses) {
			Integer courseIndex = allCourses.indexOf(course.getName());
			System.out.printf("Curso: %s Index: %d\n", course.getName(), courseIndex);

			if (courseIndex != -1) {
				allCourses.remove(courseIndex.intValue());
			}

			if (course.getFinished() && course.getGrade() >= 7.5) {
				numCourses += 3;
			}
		}

		System.out.printf("Cursos: %s Num Cursos: %d\n", allCourses.toString(), numCourses);
		output.setAvailableCoursesNum(numCourses);

		if(numCourses == 0) {
			output.setAvailableCourses(new ArrayList<String>());
		} else {
			output.setAvailableCourses(allCourses);	
		}
		
		
		return output;
	}

	public CourseRepository getCourseRepository() {
		return courseRepository;
	}

	public void setCourseRepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
}
