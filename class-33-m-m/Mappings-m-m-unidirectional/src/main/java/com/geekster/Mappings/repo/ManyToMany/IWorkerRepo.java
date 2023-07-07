package com.geekster.Mappings.repo.ManyToMany;

import com.geekster.Mappings.model.ManyToMany.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkerRepo extends CrudRepository<Worker,Long> {
}
