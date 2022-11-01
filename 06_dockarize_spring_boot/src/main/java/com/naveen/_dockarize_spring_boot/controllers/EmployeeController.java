package com.naveen._dockarize_spring_boot.controllers;

import com.naveen._dockarize_spring_boot.models.Employee;
import com.naveen._dockarize_spring_boot.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee saveEmployeeDetails(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
