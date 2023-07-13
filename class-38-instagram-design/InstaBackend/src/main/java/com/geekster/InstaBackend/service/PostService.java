package com.geekster.InstaBackend.service;


import com.geekster.InstaBackend.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;
}
