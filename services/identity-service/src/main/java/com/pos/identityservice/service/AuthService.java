package com.pos.identityservice.service;

import com.pos.identityservice.entity.UserCredential;

public interface AuthService {
    String saveUser(UserCredential userCredential);
    String generateToken(String username);
    void validateToken(String token);
}
