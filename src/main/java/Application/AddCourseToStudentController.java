package Application;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.AddCourseToStudent;
import service.AddCourseToStudentInput;
import service.CreateStudentOutput;

@RestController
@RequestMapping("/api")
public class AddCourseToStudentController {

	@PostMapping("/addCourseToStudent")
	public CreateStudentOutput index(@RequestBody AddCourseToStudentInput input) {
		AddCourseToStudent service = new AddCourseToStudent();
		return service.execute(input);
	}
}
