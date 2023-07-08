package com.geekster.Mappings.repo;

import com.geekster.Mappings.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepo extends JpaRepository<Teacher,Long> {
}
