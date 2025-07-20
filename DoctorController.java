package com.example.clinic.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @GetMapping
    public String getAllDoctors() {
        return "List of all doctors";
    }
}
