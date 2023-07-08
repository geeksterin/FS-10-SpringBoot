package com.geekster.Mappings.service;

import com.geekster.Mappings.model.Course;
import com.geekster.Mappings.repo.ICourserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    ICourserRepo iWorkerRepo;

    public void addWorker(Course worker)
    {

        iWorkerRepo.save(worker);
    }
}
