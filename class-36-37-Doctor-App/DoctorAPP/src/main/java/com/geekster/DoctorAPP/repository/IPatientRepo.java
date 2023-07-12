package com.geekster.DoctorAPP.repository;

import com.geekster.DoctorAPP.model.Admin;
import com.geekster.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient,Long> {

    Patient findFirstByPatientEmail(String newEmail);
}
