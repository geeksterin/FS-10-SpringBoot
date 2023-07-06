package com.geekster.Mappings.repo.oneToMany;

import com.geekster.Mappings.model.oneToMany.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkerRepo extends CrudRepository<Worker,Long> {
}
