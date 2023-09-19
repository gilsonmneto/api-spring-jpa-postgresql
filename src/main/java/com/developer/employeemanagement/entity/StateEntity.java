package com.developer.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="state")
public class StateEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "sta_id")
    private Long id;

    @Column(name = "sta_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private EmployeeEntity employee;

}
