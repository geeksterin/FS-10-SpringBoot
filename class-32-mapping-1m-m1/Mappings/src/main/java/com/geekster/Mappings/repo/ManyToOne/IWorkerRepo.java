package com.geekster.Mappings.repo.ManyToOne;

import com.geekster.Mappings.model.ManyToOne.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkerRepo extends CrudRepository<Worker,Long> {
}
