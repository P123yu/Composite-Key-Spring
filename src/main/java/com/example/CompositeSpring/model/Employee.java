package com.example.CompositeSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_table")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @EmbeddedId
    private EmployeeIdentity employeeIdentity;

    @Column(name="name")
    public String name;

    @Column(name="email")
    public String email;
}
