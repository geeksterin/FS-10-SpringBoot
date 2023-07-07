package com.geekster.Mappings.service.ManyToMany;

import com.geekster.Mappings.model.ManyToMany.Worker;
import com.geekster.Mappings.repo.ManyToMany.IWorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired
    IWorkerRepo iWorkerRepo;

    public void addWorker(Worker worker)
    {

        iWorkerRepo.save(worker);
    }
}
