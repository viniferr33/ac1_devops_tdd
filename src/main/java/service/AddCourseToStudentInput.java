package service;

public class AddCourseToStudentInput {
	public int id;
	public String courseName;
	public Double grade;
	public Boolean finished;

	public AddCourseToStudentInput(int id, String courseName, Double grade, Boolean finished) {
		this.id = id;
		this.courseName = courseName;
		this.grade = grade;
		this.finished = finished;
	}
}
