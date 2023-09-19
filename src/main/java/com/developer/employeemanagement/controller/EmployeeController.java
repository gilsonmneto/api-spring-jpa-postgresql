package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.save(employeeEntity);
    }

    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.update(employeeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }
}
