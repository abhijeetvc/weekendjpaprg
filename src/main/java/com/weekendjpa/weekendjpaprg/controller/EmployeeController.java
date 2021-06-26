package com.weekendjpa.weekendjpaprg.controller;

import com.weekendjpa.weekendjpaprg.models.Employee;
import com.weekendjpa.weekendjpaprg.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getallemps")
    public List<Employee> getALlEMployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }
}
