package com.microtech.EasyBuy.controller;

import com.microtech.EasyBuy.entity.Employee;
import com.microtech.EasyBuy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
@Autowired
    EmployeeRepository employeeRepository;
@PostMapping("add/emp")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
    employeeRepository.save(employee);
    return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);
}
}
