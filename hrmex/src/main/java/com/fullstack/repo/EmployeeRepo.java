package com.fullstack.repo;

import com.fullstack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);
}
