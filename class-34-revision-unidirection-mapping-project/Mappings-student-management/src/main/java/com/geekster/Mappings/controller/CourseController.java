package com.geekster.Mappings.controller;

import com.geekster.Mappings.model.Course;
import com.geekster.Mappings.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public void addWorker(@RequestBody Course worker)
    {
        courseService.addWorker(worker);
    }

}
