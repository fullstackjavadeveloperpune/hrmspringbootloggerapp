package com.fullstack.controller;

import com.fullstack.dto.LoginRequest;
import com.fullstack.entity.Employee;
import com.fullstack.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    private final IEmployeeService employeeService;

    @PostMapping("/signup")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {

        log.info("@@@@@@@@@@Trying to signup for Employee: " + employee.getEmpName());
        log.trace("******* TRACE LOG **********");
        log.debug("******* debug LOG **********");
        log.info("******* info LOG **********");
        log.warn("******* warn LOG **********");
        log.error("******* error LOG **********");


        return new ResponseEntity<>(employeeService.signUp(employee), HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<Boolean> signIn(@RequestBody LoginRequest loginRequest) {
        log.info("@@@@@@@@@@Inside SignIn Controller Method: ");

        return new ResponseEntity<>(employeeService.signIn(loginRequest.empEmailId(), loginRequest.empPassword()), HttpStatus.OK);
    }


}
