package service;

import java.util.ArrayList;

import entity.Course;
import entity.Student;
import repository.StudentRepository;

public class CreateStudent {
	public CreateStudentOutput execute(CreateStudentInput input) {
		Student student = new Student("Not Implemented!", input.Name, new ArrayList<Course>());
		int studentId = StudentRepository.createStudent(student);

		return new CreateStudentOutput(studentId, student.getName(), student.getRA(), student.getCourseList());
	}

}
