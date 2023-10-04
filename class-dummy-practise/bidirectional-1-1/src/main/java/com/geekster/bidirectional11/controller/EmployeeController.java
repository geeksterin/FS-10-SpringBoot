package com.geekster.bidirectional11.controller;

import com.geekster.bidirectional11.model.Address;
import com.geekster.bidirectional11.model.Emp;
import com.geekster.bidirectional11.service.AddressService;
import com.geekster.bidirectional11.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


    @GetMapping("emp")
    public List<Emp> getAllEmp()
    {

        return employeeService.getAllEmp();
    }

    @PostMapping("emp")
    public String addAddress(@RequestBody Emp emp)
    {

        return employeeService.addEmp(emp);
    }
}
