package com.springboot.restapi.service;

import com.springboot.restapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
}
