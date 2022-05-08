package com.msoftsolution.myrh.services.IService;

import com.msoftsolution.myrh.dto.requestDTO.LoginRequest;
import com.msoftsolution.myrh.dto.requestDTO.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface IAuth {

    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);
    ResponseEntity<?> registerUser( SignupRequest signUpRequest);

}
