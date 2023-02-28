package com.rahulhembrom.springbootdemo.controller;

import com.rahulhembrom.springbootdemo.entity.Department;
import com.rahulhembrom.springbootdemo.service.DepartmentService;
import com.rahulhembrom.springbootdemo.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
}
