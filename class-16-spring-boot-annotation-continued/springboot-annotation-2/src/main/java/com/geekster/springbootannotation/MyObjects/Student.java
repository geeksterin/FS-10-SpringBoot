package com.geekster.springbootannotation.MyObjects;


import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Student object created !!!!");
    }
}
