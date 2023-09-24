package service;

import entity.Course;
import entity.Student;
import repository.StudentRepository;

public class AddCourseToStudent {

	public CreateStudentOutput execute(AddCourseToStudentInput input) {
		Student student = StudentRepository.getStudentList().get(input.id);
		Course course = new Course(input.courseName, input.finished, input.grade);

		student.getCourseList().add(course);

		return new CreateStudentOutput(input.id, student.getName(), student.getRA(), student.getCourseList());
	}
}
