package repository;

import java.util.ArrayList;

import entity.Student;

public class StudentRepository {
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static ArrayList<Student> getStudentList() {
		return StudentRepository.studentList;
	}
	
	public static int createStudent(Student s) {
		StudentRepository.studentList.add(s);
		return StudentRepository.studentList.size() - 1;
	}
}
