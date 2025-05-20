package com.daivesh.service;

import com.daivesh.model.VerificationCode;

public interface VerificationService {

    VerificationCode createVerificationCode(String otp, String email);
}
