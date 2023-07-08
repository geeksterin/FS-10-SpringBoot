package com.geekster.Mappings.service;

import com.geekster.Mappings.repo.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    ITeacherRepo iTeacherRepo;
}
