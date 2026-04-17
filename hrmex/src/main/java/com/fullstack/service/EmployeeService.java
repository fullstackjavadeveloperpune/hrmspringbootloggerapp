package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepo employeeRepo;

    @Override
    public Employee signUp(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {
        log.info("Inside SignIn Service method");
        return employeeRepo.findByEmpEmailIdAndEmpPassword(empEmailId, empPassword) != null;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(long empId) {
        return employeeRepo.findById(empId);
    }
}
