package com.geekster.Mappings.repo.oneToMany;

import com.geekster.Mappings.model.oneToMany.Dept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeptRepo extends CrudRepository<Dept,Long> {
}
