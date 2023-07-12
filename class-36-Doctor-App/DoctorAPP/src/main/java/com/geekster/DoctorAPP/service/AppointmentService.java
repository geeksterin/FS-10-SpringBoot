package com.geekster.DoctorAPP.service;


import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.Doctor;
import com.geekster.DoctorAPP.repository.IAppointmentRepo;
import com.geekster.DoctorAPP.repository.IDoctorRepo;
import com.geekster.DoctorAPP.repository.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    @Autowired
    IDoctorRepo doctorRepo;

    @Autowired
    IPatientRepo patientRepo;

    public void scheduleAppointment(Appointment appointment) {

        //id of doctor
        Long doctorId = appointment.getDoctor().getDoctorId();
        boolean isDoctorValid = doctorRepo.existsById(doctorId);

        //id of patient
        Long patientId = appointment.getPatient().getPatientId();
        boolean isPatientValid = patientRepo.existsById(patientId);

        if(isDoctorValid && isPatientValid)
        {
            appointmentRepo.save(appointment);
        }
        else
        {
            throw new IllegalStateException("appointment meta data invalid");
        }




    }


    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }
}
