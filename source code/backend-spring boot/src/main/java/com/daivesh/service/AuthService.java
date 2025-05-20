package com.daivesh.service;

import com.daivesh.exception.SellerException;
import com.daivesh.exception.UserException;
import com.daivesh.request.LoginRequest;
import com.daivesh.request.SignupRequest;
import com.daivesh.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
