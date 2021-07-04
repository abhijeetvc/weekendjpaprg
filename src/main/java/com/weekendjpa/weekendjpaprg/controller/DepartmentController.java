package com.weekendjpa.weekendjpaprg.controller;

import com.weekendjpa.weekendjpaprg.models.Department;
import com.weekendjpa.weekendjpaprg.respository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/saveDept")
    public String saveDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Department saved!!!";
    }
}
