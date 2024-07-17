package com.example.CompositeSpring.service.impl;

import com.example.CompositeSpring.model.Employee;
import com.example.CompositeSpring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.CompositeSpring.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
