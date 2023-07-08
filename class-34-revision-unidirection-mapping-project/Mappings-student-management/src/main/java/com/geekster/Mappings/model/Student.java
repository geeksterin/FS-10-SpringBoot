package com.geekster.Mappings.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    //mappings
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_subject_id")
    private Subject subject;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_student_course_table",joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_course_id"))
    private List<Course> courses;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private List<Teacher> teachers;


}

