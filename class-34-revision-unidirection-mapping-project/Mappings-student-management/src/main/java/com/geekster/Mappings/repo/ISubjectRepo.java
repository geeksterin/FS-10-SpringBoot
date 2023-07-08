package com.geekster.Mappings.repo;

import com.geekster.Mappings.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepo extends CrudRepository<Subject,Long> {
}
