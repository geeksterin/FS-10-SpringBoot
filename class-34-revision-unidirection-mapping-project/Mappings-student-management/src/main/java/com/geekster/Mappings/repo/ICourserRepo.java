package com.geekster.Mappings.repo;

import com.geekster.Mappings.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourserRepo extends CrudRepository<Course,Long> {
}
