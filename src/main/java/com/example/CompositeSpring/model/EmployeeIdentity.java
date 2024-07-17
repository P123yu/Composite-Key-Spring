package com.example.CompositeSpring.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
public class EmployeeIdentity implements Serializable {

    @Column(name="company_id")
    private Integer companyId;

    @Column(name="employee_id")
    private Integer employeeId;
}
