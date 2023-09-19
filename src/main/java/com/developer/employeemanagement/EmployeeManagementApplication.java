package com.developer.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	//localhost:8080/employee
	// {
	//        "id": 1,
	//        "name": "Gilson Miranda",
	//        "gender": "male",
	//        "dateOfBirth": "2023-09-19T00:00:00.000+00:00",
	//        "address": "ABC USA"
	//  }

}
