package com.geekster.DoctorAPP.controller;

import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.Doctor;
import com.geekster.DoctorAPP.service.AppointmentService;
import com.geekster.DoctorAPP.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;


    @GetMapping("appointments")
    List<Appointment> getAllAppointments()
    {
        return appointmentService.getAllAppointments();
    }
}
