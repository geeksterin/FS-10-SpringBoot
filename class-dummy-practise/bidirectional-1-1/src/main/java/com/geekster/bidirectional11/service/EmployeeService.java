package com.geekster.bidirectional11.service;

import com.geekster.bidirectional11.model.Address;
import com.geekster.bidirectional11.model.Emp;
import com.geekster.bidirectional11.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public String addEmp(Emp emp) {

        //hack
        emp.getAddress().setEmployee(emp);
        employeeRepo.save(emp);
        return "employee added";
    }

    public List<Emp> getAllEmp() {
       return employeeRepo.findAll();
    }
}
