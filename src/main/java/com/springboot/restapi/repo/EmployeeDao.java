package com.springboot.restapi.repo;

import com.springboot.restapi.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();

    public Employee findById(int id);
}
