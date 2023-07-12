package com.geekster.DoctorAPP.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.geekster.DoctorAPP.model.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Patient.class,property="patientId")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    private String patientName;

    @Pattern(regexp = "^.+@(?![Hh][Oo][Ss][Pp][Aa][Dd][Mm][Ii][Nn]\\.[Cc][Oo][Mm]$).+$")
    @Column(unique = true)
    private String patientEmail;
    @NotBlank
    private String patientPassword;
    private Integer patientAge;
    private String patientAddress;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(mappedBy = "patient")
    Appointment appointment;
}
