package com.devopsassignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevopsAssignement2Application {

	@GetMapping("/home")
	public String message(){
		return "welcome to devops assignment2 by mohammed adil";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsAssignement2Application.class, args);
	}

}