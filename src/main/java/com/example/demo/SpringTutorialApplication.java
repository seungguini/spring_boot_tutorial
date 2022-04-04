package com.example.demo;

import Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;
import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
@RestController // Makes this class serve rest Routes
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}

	// Create a GET route for \hello
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Seunggun", "sl6369@nyu.edu", LocalDate.of(1999, Month.JANUARY, 5), 21)
		);
	}

}
