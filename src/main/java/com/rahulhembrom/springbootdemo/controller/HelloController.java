package com.rahulhembrom.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String helloWorld(){
        return "Hello";
    }
}
