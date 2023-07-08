package com.geekster.Mappings.service;

import com.geekster.Mappings.model.Subject;
import com.geekster.Mappings.repo.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    ISubjectRepo iSubjectRepo;

    public void addSubjectSpec(Subject subject)
    {

    }

    public void addSubject(Subject subject)
    {

        iSubjectRepo.save(subject);
    }
}
