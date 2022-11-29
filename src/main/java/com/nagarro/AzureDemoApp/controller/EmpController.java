package com.nagarro.AzureDemoApp.controller;

import java.util.List;

import com.nagarro.AzureDemoApp.com.nagarro.AzureDemoApp.entity.Employee;
import com.nagarro.AzureDemoApp.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return empRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmp(){
        return empRepository.findAll();
    }
}
