package com.geekster.Mappings.service.oneToMany;

import com.geekster.Mappings.model.oneToMany.Dept;
import com.geekster.Mappings.repo.oneToMany.IDeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DeptService {

    @Autowired
    IDeptRepo iDeptRepo;

    public void addDept(Dept dept)
    {

        iDeptRepo.save(dept);
    }
}
