package com.fullstack.service;

import com.fullstack.entity.Employee;

public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);
}
