package com.geekster.Mappings.controller;


import com.geekster.Mappings.model.Student;
import com.geekster.Mappings.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public void addEmp(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
}
