package com.geekster.Mappings.controller.oneToOne;


import com.geekster.Mappings.model.oneToOne.Employee;
import com.geekster.Mappings.service.oneToOne.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("employee")
    public void addEmp(@RequestBody Employee emp)
    {
        empService.addEmp(emp);
    }
}
