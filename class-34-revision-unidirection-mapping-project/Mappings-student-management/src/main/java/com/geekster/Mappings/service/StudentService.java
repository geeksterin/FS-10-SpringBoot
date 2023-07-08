package com.geekster.Mappings.service;

import com.geekster.Mappings.model.Student;
import com.geekster.Mappings.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public void addStudent(Student student) {

        iStudentRepo.save(student);
    }
}
