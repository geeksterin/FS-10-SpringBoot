package com.geekster.DoctorAPP.service;


import com.geekster.DoctorAPP.model.Patient;
import com.geekster.DoctorAPP.repository.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    @Autowired
    IPatientRepo patientRepo;

    public void addPatient(Patient patient) {
        patientRepo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }
}
