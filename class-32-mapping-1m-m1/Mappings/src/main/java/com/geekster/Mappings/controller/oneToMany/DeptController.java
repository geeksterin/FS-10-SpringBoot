package com.geekster.Mappings.controller.oneToMany;

import com.geekster.Mappings.model.oneToMany.Dept;
import com.geekster.Mappings.repo.oneToMany.IDeptRepo;
import com.geekster.Mappings.service.oneToMany.DeptService;
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
