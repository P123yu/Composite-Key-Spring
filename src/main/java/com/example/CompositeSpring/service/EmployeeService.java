package com.example.CompositeSpring.service;

import com.example.CompositeSpring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface EmployeeService {

    // create
    Employee createEmployee(Employee employee);

    // getAll
    List<Employee> getAllEmployee();
}
