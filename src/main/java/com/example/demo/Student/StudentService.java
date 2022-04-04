package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // Makes StudentService a Spring Component (Service extends component
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Seunggun",
                        "sl6369@nyu.edu",
                        LocalDate.of(1999, Month.JANUARY, 5),
                        21)
        );
    }
}
