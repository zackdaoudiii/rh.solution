package com.msoftsolution.myrh.dto.requestDTO;


import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {

    private String username, email, password;
    private Set<String> role;


}

