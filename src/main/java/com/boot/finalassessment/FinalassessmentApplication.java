package com.boot.finalassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class FinalassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalassessmentApplication.class, args);
	}
	@GetMapping("/company")
	public String comp() {
		return "Welcome to Verizon";
	}
	@GetMapping("/training")
	public String training() {
		return "Training session is for a period of one month";
	}
	@GetMapping("/finals")
	public String finals() {
		return "This is Final Assessment";
	}

}




	



