package com.msoftsolution.myrh.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtResponse {

    private String token;
    private String type;
    private Long id;
    private String  username;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
        this.token = token;
        this.type = "Bearer ";
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }



}