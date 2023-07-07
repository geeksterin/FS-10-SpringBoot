package com.geekster.Mappings.model.ManyToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    private String deptName;


    @ManyToMany
    @JoinTable(name = "dept_worker-join_table",joinColumns = @JoinColumn(name = "fk_dept_id"),
            inverseJoinColumns= @JoinColumn(name = "fk_worker_id"))
    List<Worker> workers;



}
