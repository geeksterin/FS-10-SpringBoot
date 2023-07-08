package com.geekster.Mappings.controller;

import com.geekster.Mappings.model.Subject;
import com.geekster.Mappings.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping("subject")
    public void addSubject(@RequestBody Subject subject)
    {
        subjectService.addSubject(subject);
    }

    @PostMapping("subject/special")
    public void addSubjectSpec(@RequestBody Subject subject)
    {
        subjectService.addSubjectSpec(subject);
    }
}
