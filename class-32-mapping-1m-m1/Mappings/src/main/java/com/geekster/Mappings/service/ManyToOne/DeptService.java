package com.geekster.Mappings.service.ManyToOne;

import com.geekster.Mappings.model.ManyToOne.Dept;
import com.geekster.Mappings.repo.ManyToOne.IDeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    IDeptRepo iDeptRepo;

    public void addDept(Dept dept)
    {

        iDeptRepo.save(dept);
    }
}
