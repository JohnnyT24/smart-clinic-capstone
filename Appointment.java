package com.example.clinic.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime appointmentDate;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    // Getters and Setters
}
