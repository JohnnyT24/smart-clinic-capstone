package com.example.clinic.service;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
    public String generateToken(String username) {
        return "mock-token-for-" + username;
    }
}
