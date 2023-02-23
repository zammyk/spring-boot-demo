package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> showStudents(){
        return List.of(
                new Student(
                        1L,
                        "Rahul",
                        "rhembrom21@gmail.com",
                        23,
                        LocalDate.of(2000, Month.JANUARY,28)
                )
        );
    }

}
