package com.naveen._dockarize_spring_boot.repository;

import com.naveen._dockarize_spring_boot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}