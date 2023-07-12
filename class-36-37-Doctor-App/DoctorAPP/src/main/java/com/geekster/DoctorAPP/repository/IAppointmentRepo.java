package com.geekster.DoctorAPP.repository;

import com.geekster.DoctorAPP.model.Admin;
import com.geekster.DoctorAPP.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {
}
