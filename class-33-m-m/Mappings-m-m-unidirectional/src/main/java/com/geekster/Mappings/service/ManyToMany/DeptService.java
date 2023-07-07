package com.geekster.Mappings.service.ManyToMany;

import com.geekster.Mappings.model.ManyToMany.Dept;
import com.geekster.Mappings.model.ManyToMany.Worker;
import com.geekster.Mappings.repo.ManyToMany.IDeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    IDeptRepo iDeptRepo;

    public void addDeptSpec(Dept dept)
    {
        Long passedId = dept.getDeptId();
        Dept deptDB = iDeptRepo.findById(passedId).orElse(null);
        if(deptDB!=null)
        {
            List<Worker> existingWorkers = deptDB.getWorkers();
            List<Worker> newWorkers = dept.getWorkers();
            newWorkers.addAll(existingWorkers);

        }

        iDeptRepo.save(dept);
    }

    public void addDept(Dept dept)
    {

        iDeptRepo.save(dept);
    }
}
