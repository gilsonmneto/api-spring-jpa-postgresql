package com.developer.employeemanagement.entity;

import java.util.Date;
import java.util.Set;


import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name="employee")
public class EmployeeEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<StateEntity> states;

}
