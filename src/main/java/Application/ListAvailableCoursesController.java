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
import repository.StudentRepository;
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
		return StudentRepository.getStudentList();
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
