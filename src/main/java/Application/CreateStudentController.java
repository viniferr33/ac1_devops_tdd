package Application;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.CreateStudent;
import service.CreateStudentInput;
import service.CreateStudentOutput;

@RestController
@RequestMapping("/api")
public class CreateStudentController {
	
	@PostMapping("/createStudent")
	public CreateStudentOutput index(@RequestBody CreateStudentInput input) {
		CreateStudent service = new CreateStudent();
		return service.execute(input);
	}
}
