package Application;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entity.Course;
import entity.Student;
import repository.CourseRepository;
import service.ListAvailableCoursesOutput;
import service.ListAvailableCourses;

@RestController
@RequestMapping("/api")
public class ListAvailableCoursesController {

	private CourseRepository createCourseRepository() {
		ArrayList<String> allCourses = new ArrayList<String>();
		allCourses.add("Curso1");
		allCourses.add("Curso2");
		allCourses.add("Curso3");
		allCourses.add("Curso4");
		allCourses.add("Curso5");
		allCourses.add("Curso6");
		allCourses.add("Curso7");
		allCourses.add("Curso8");
		allCourses.add("Curso9");
		allCourses.add("Curso10");

		return new CourseRepository(allCourses);
	}

	private ArrayList<Student> createMockedStudents() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Course course1 = new Course("Curso1", true, 7.5);
		Course course2 = new Course("Curso2", true, 3.0);
		Course course3 = new Course("Curso3", false, 0.0);
		Course course4 = new Course("Curso4", true, 4.5);
		Course course5 = new Course("Curso5", true, 3.0);
		Course course6 = new Course("Curso6", false, 1.0);
		Course course7 = new Course("Curso7", true, 7.5);
		Course course8 = new Course("Curso8", true, 10.0);
		Course course9 = new Course("Curso9", false, 7.0);
		Course course10 = new Course("Curso10", false, 0.0);
			
		studentList.add(new Student("200200", "Student1", Arrays.asList(course1, course2, course9)));
		studentList.add(new Student("200201", "Student2", Arrays.asList(course4, course2)));
		studentList.add(new Student("200202", "Student3", Arrays.asList(course5, course2, course7)));
		studentList.add(new Student("200203", "Student4", Arrays.asList(course6, course2, course8, course3)));
		studentList.add(new Student("200204", "Student5", Arrays.asList(course2, course10)));
		
		
		return studentList;
	}

	@GetMapping("/listAvailableCourses")
	public ListAvailableCoursesOutput index(@RequestParam("id") int id) {
		ArrayList<Student> mockedStudents = this.createMockedStudents();
		
		CourseRepository courseRepository = this.createCourseRepository();
		ListAvailableCourses service = new ListAvailableCourses();
		service.setCourseRepository(courseRepository);
		
		return service.execute(mockedStudents.get(id));		
	}

}
