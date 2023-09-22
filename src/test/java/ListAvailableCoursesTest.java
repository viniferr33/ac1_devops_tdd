import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ac1.entities.Course;
import com.ac1.entities.Student;

import repository.CourseRepository;

public class ListAvailableCoursesTest {
	public ArrayList<String> allCourses;
	public ListAvailableCourses listAvailableCourses;
	
	@Before
	public void beforeAll() {
		this.allCourses = new ArrayList<String>();
		this.allCourses.add("Curso1");		
		this.allCourses.add("Curso2");		
		this.allCourses.add("Curso3");		
		this.allCourses.add("Curso4");		
		this.allCourses.add("Curso5");		
		this.allCourses.add("Curso6");		
		this.allCourses.add("Curso7");		
		this.allCourses.add("Curso8");		
		this.allCourses.add("Curso9");		
		this.allCourses.add("Curso10");		
		
		
		this.listAvailableCourses = new ListAvailableCourses();		
		this.listAvailableCourses.setCourseRepository(new CourseRepository(this.allCourses));
	}
	
	@Test
	public void testListAvailableCourses_firstEnrollment() {
		/**
		 * Dado que aluno existe, quando é solicitado quais cursos estão disponiveis e ele
		 * esta escolhendo seu primeiro curso, são retornados os cursos standart da plataforma
		 */
		
		
		// Arrange -> Criar um novo aluno sem nenhum curso
		Student std = new Student("200200", "Student1", new ArrayList<Course>());
		
		
		// Act -> Chama a função execute passando o aluno
		ListAvailableCoursesOutput output = this.listAvailableCourses.execute(std);
		
		// Assert -> Todos os cursos devem ser retornados
		Integer numAvailableCourses = 1;
		
		assertEquals(output.getAvailableCourses(), this.allCourses);
		assertEquals(output.getAvailableCoursesNum(), numAvailableCourses);
	}
	
	@Test
	public void testListAvailableCourses_aboveAverage() {
		// Arrange -> Criar um novo aluno com pelo menos um curso com media > 7
		Course course1 = new Course("Curso1", true, 7.5);
		Course course2 = new Course("Curso2", true, 3.0);
		Course course3 = new Course("Curso3", false, 0.0);
		
		Student std = new Student("200200", "Student2", Arrays.asList(course1, course2, course3));
		
		
		// Act -> Chama a função execute passando o aluno
		ListAvailableCoursesOutput output = this.listAvailableCourses.execute(std);
		
		// Assert -> Apenas os cursos que ele não possuem devem ser retornados, e a quantidade deve ser 3
		List<String> expectedCoursesList = Arrays.asList(
				"Curso4", 
				"Curso5", 
				"Curso6", 
				"Curso7", 
				"Curso8", 
				"Curso9", 
				"Curso10" 
				);
		Integer expectedCoursesNum = 3;
		
		assertEquals(output.getAvailableCourses(), expectedCoursesList);
		assertEquals(output.getAvailableCoursesNum(), expectedCoursesNum);
	}
	
	@Test
	public void testListAvailableCourses_bellowAverage() {
		// Arrange -> Criar um novo aluno com cursos onde ele falhou
		Course course1 = new Course("Curso8", true, 3.5);
		Course course2 = new Course("Curso9", true, 3.0);
		Course course3 = new Course("Curso10", false, 0.0);
		
		Student std = new Student("200200", "Student3", Arrays.asList(course1, course2, course3));
		
		
		// Act -> Chama a função execute passando o aluno
		ListAvailableCoursesOutput output = this.listAvailableCourses.execute(std);
		
		// Assert -> Nenhum curso deve ser retornado
		List<String> expectedCoursesList = new ArrayList<String>();
		Integer expectedCoursesNum = 0;
		
		assertEquals(output.getAvailableCourses(), expectedCoursesList);
		assertEquals(output.getAvailableCoursesNum(), expectedCoursesNum);
	}
}
