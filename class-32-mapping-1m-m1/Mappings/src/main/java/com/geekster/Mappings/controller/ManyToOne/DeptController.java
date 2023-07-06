package com.geekster.Mappings.controller.ManyToOne;

import com.geekster.Mappings.model.ManyToOne.Dept;
import com.geekster.Mappings.service.ManyToOne.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("Dept")
    public void addDept(@RequestBody Dept dept)
    {
        deptService.addDept(dept);
    }
}
