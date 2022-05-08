package com.msoftsolution.myrh.controllers;

import com.msoftsolution.myrh.Enums.ERole;
import com.msoftsolution.myrh.config.security.JwtUtils;
import com.msoftsolution.myrh.domains.Role;
import com.msoftsolution.myrh.domains.User;
import com.msoftsolution.myrh.dto.requestDTO.JwtResponse;
import com.msoftsolution.myrh.dto.requestDTO.LoginRequest;
import com.msoftsolution.myrh.dto.requestDTO.SignupRequest;
import com.msoftsolution.myrh.dto.responseDTO.MessageResponse;
import com.msoftsolution.myrh.repositories.RoleRepository;
import com.msoftsolution.myrh.repositories.UserRepository;
import com.msoftsolution.myrh.services.IService.IAuth;
import com.msoftsolution.myrh.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final IAuth iAuth;

    @Autowired
   public AuthController(IAuth iAuth){
       this.iAuth = iAuth;
   }


    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest)throws Exception{
        try{
            return iAuth.authenticateUser(loginRequest);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) throws Exception {
       try{
            return iAuth.registerUser(signUpRequest);
        }catch (Exception e){
           throw new Exception(e.getMessage());
       }
    }


}