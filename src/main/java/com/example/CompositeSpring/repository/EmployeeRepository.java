package com.example.CompositeSpring.repository;

import com.example.CompositeSpring.model.Employee;
import com.example.CompositeSpring.model.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {
}
