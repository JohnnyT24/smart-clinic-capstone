package com.example.clinic.service;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    public String getAppointmentsForPatient(Long patientId) {
        return "Appointments for patient ID: " + patientId;
    }
}
