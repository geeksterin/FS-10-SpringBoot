package com.geekster.Mappings.repo.ManyToMany;

import com.geekster.Mappings.model.ManyToMany.Dept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeptRepo extends CrudRepository<Dept,Long> {
}
