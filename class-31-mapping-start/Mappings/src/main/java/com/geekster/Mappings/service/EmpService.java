package com.geekster.Mappings.service;

import com.geekster.Mappings.model.oneToOne.Employee;
import com.geekster.Mappings.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    IEmpRepo iEmpRepo;

    public void addEmp(Employee emp) {
        iEmpRepo.save(emp);
    }
}
