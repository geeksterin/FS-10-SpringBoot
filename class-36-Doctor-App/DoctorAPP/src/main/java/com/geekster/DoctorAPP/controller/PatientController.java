package com.geekster.DoctorAPP.controller;


import com.geekster.DoctorAPP.model.Doctor;
import com.geekster.DoctorAPP.model.Patient;
import com.geekster.DoctorAPP.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("patient")
    void addPatient(@RequestBody Patient patient)
    {
        patientService.addPatient(patient);
    }

    @GetMapping("patients")
    List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }
}
