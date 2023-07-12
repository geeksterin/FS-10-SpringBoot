package com.geekster.DoctorAPP.service;


import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.AuthenticationToken;
import com.geekster.DoctorAPP.model.Patient;
import com.geekster.DoctorAPP.model.dto.SignInInput;
import com.geekster.DoctorAPP.model.dto.SignUpOutput;
import com.geekster.DoctorAPP.repository.IAuthTokenRepo;
import com.geekster.DoctorAPP.repository.IDoctorRepo;
import com.geekster.DoctorAPP.repository.IPatientRepo;
import com.geekster.DoctorAPP.service.utility.emailUtility.EmailHandler;
import com.geekster.DoctorAPP.service.utility.hashingUtility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    @Autowired
    IPatientRepo patientRepo;

    @Autowired
    IDoctorRepo doctorRepo;

    @Autowired
    IAuthTokenRepo authTokenRepo;

    @Autowired
    AppointmentService appointmentService;

    public SignUpOutput signUpPatient(Patient patient) {

        boolean signUpStatus = true;
        String signUpStatusMessage = null;

        String newEmail = patient.getPatientEmail();

        if(newEmail == null)
        {
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }

        //check if this patient email already exists ??
        Patient existingPatient = patientRepo.findFirstByPatientEmail(newEmail);

        if(existingPatient != null)
        {
            signUpStatusMessage = "Email already registered!!!";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(patient.getPatientPassword());

            //saveAppointment the patient with the new encrypted password

            patient.setPatientPassword(encryptedPassword);
            patientRepo.save(patient);

            return new SignUpOutput(signUpStatus, "Patient registered successfully!!!");
        }
        catch(Exception e)
        {
            signUpStatusMessage = "Internal error occurred during sign up";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }


    public String signInPatient(SignInInput signInInput) {


        String signInStatusMessage = null;

        String signInEmail = signInInput.getEmail();

        if(signInEmail == null)
        {
            signInStatusMessage = "Invalid email";
            return signInStatusMessage;


        }

        //check if this patient email already exists ??
        Patient existingPatient = patientRepo.findFirstByPatientEmail(signInEmail);

        if(existingPatient == null)
        {
            signInStatusMessage = "Email not registered!!!";
            return signInStatusMessage;

        }

        //match passwords :

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());
            if(existingPatient.getPatientPassword().equals(encryptedPassword))
            {
                //session should be created since password matched and user id is valid
                AuthenticationToken authToken  = new AuthenticationToken(existingPatient);
                authTokenRepo.save(authToken);

                EmailHandler.sendEmail(signInEmail,"email testing",authToken.getTokenValue());
                return "Token sent to your email";
            }
            else {
                signInStatusMessage = "Invalid credentials!!!";
                return signInStatusMessage;
            }
        }
        catch(Exception e)
        {
            signInStatusMessage = "Internal error occurred during sign in";
            return signInStatusMessage;
        }

    }

    //todo : create sign out on your own

    public boolean scheduleAppointment(Appointment appointment) {
        //id of doctor
        Long doctorId = appointment.getDoctor().getDoctorId();
        boolean isDoctorValid = doctorRepo.existsById(doctorId);

        //id of patient
        Long patientId = appointment.getPatient().getPatientId();
        boolean isPatientValid = patientRepo.existsById(patientId);

        if(isDoctorValid && isPatientValid)
        {
            appointmentService.saveAppointment(appointment);
            return true;
        }
        else {
            return false;
        }
    }

    public void cancelAppointment(String email) {

        //email -> Patient
        Patient patient = patientRepo.findFirstByPatientEmail(email);

        Appointment appointment = appointmentService.getAppointmentForPatient(patient);

        appointmentService.cancelAppointment(appointment);



    }

    public String sigOutPatient(String email) {

        Patient patient = patientRepo.findFirstByPatientEmail(email);
        authTokenRepo.delete(authTokenRepo.findFirstByPatient(patient));
        return "Patient Signed out successfully";
    }
}
