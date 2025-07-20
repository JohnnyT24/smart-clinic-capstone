package com.example.clinic.service;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    public String getDoctorDetails(Long id) {
        return "Doctor details for ID: " + id;
    }
}
