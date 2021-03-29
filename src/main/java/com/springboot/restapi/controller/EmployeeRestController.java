package com.springboot.restapi.controller;

import com.springboot.restapi.exception.EmployeeNotFoundException;
import com.springboot.restapi.model.Employee;
import com.springboot.restapi.repo.EmployeeDao;
import com.springboot.restapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new EmployeeNotFoundException("Employee Id Not Found");
        }
        return employee;

    }

    @PostMapping("/employees")
    public Employee save(@RequestBody  Employee employee){
        employee.setId(0);
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
         employeeService.save(employee);
         return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw  new EmployeeNotFoundException("Employee Id Not Found - "+ id);
        }
        employeeService.deleteById(id);
        return "Deleted Employee Id - " + id;
    }
}
