package com.springboot.restapi.controller;

import com.springboot.restapi.model.Employee;
import com.springboot.restapi.repo.EmployeeDao;
import com.springboot.restapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmployeeRestController {

//    @Autowired
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
