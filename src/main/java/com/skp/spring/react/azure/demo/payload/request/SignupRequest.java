package com.skp.spring.react.azure.demo.payload.request;

import lombok.Data;

import java.util.List;

@Data
public class SignupRequest {
    private String username;
    private  String email;
    private String password;
    private List<String> roles;
}
