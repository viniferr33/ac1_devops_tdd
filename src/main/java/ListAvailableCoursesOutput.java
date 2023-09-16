import java.util.List;

public class ListAvailableCoursesOutput {
	public List<String> availableCourses;
	public Integer availableCoursesNum;
	public ListAvailableCoursesOutput(List<String> availableCourses, Integer availableCoursesNum) {
		this.availableCourses = availableCourses;
		this.availableCoursesNum = availableCoursesNum;
	}
	public ListAvailableCoursesOutput() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getAvailableCourses() {
		return availableCourses;
	}
	public void setAvailableCourses(List<String> availableCourses) {
		this.availableCourses = availableCourses;
	}
	public Integer getAvailableCoursesNum() {
		return availableCoursesNum;
	}
	public void setAvailableCoursesNum(Integer availableCoursesNum) {
		this.availableCoursesNum = availableCoursesNum;
	}
	
	
}
