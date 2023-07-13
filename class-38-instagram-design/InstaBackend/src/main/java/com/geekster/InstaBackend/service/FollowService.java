package com.geekster.InstaBackend.service;

import com.geekster.InstaBackend.repository.IFollowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowService {

    @Autowired
    IFollowRepo followRepo;
}
