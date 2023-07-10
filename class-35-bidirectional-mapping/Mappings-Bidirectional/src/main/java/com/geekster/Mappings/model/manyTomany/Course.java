package com.geekster.Mappings.model.manyTomany;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;


    @ManyToMany
    @JoinTable(name = "course_student_join_table",joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    List<Student> student;
}
