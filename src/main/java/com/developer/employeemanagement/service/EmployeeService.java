package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public EmployeeEntity save(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    public EmployeeEntity update(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

}