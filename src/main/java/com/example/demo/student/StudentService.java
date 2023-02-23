package com.example.demo.student;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
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
