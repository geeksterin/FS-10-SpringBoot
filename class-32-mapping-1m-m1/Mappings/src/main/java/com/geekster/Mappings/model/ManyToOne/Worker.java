package com.geekster.Mappings.model.ManyToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId;
    private String workerName;


    @ManyToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_dept_id")
    Dept dept;




}
