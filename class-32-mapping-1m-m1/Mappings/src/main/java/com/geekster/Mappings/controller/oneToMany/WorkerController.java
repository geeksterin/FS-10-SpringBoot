package com.geekster.Mappings.controller.oneToMany;

import com.geekster.Mappings.model.oneToMany.Worker;
import com.geekster.Mappings.repo.oneToMany.IWorkerRepo;
import com.geekster.Mappings.service.oneToMany.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {


    @Autowired
    WorkerService workerService;

    @PostMapping("worker")
    public void addWorker(@RequestBody Worker worker)
    {
        workerService.addWorker(worker);
    }

}
