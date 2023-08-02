package com.withbezkoder.securityjwt.services;

import com.withbezkoder.securityjwt.dao.request.SignInRequest;
import com.withbezkoder.securityjwt.dao.request.SignUpRequest;
import com.withbezkoder.securityjwt.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest request);
}
