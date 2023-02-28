package com.rahulhembrom.springbootdemo.service;

import com.rahulhembrom.springbootdemo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
