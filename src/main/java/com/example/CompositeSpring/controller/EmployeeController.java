package com.example.CompositeSpring.controller;


import com.example.CompositeSpring.model.Employee;
import com.example.CompositeSpring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/post")
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
