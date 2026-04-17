package com.fullstack.service;

import com.fullstack.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);

    List<Employee> findAll();

    Optional<Employee> findById(long empId);
}
