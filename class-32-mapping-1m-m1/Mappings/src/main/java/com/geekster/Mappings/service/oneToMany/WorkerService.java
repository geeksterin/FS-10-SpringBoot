package com.geekster.Mappings.service.oneToMany;

import com.geekster.Mappings.model.oneToMany.Worker;
import com.geekster.Mappings.repo.oneToMany.IWorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class WorkerService {

    @Autowired
    IWorkerRepo iWorkerRepo;

    public void addWorker(Worker worker)
    {

        iWorkerRepo.save(worker);
    }
}
