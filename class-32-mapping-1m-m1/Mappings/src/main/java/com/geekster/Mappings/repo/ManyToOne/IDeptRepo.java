package com.geekster.Mappings.repo.ManyToOne;

import com.geekster.Mappings.model.ManyToOne.Dept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeptRepo extends CrudRepository<Dept,Long> {
}
