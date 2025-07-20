package com.example.clinic.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    @GetMapping
    public String getPrescriptions() {
        return "Prescription list";
    }
}
