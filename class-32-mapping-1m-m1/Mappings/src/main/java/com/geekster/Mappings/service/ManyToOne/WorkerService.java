package com.geekster.Mappings.service.ManyToOne;

import com.geekster.Mappings.model.ManyToOne.Worker;
import com.geekster.Mappings.repo.ManyToOne.IWorkerRepo;
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
