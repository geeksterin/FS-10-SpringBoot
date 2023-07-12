package com.geekster.DoctorAPP.repository;

import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.AuthenticationToken;
import com.geekster.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByPatient(Patient patient);
}
