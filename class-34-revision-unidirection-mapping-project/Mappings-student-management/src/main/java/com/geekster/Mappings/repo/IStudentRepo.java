package com.geekster.Mappings.repo;

import com.geekster.Mappings.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Long> {
}
