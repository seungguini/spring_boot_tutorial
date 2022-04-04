package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class with resources for API
 * */
@RestController // Also a component
@RequestMapping("api/v1/student") // Define route path
public class StudentController {

    private final StudentService studentService;

    // Spring container creates a StudentService bean (instantiation) and injects it
    @Autowired // Constructor dependency injection for StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // Create a GET route for \
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
