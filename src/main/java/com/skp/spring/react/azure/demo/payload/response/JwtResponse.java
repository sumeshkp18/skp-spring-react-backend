package com.skp.spring.react.azure.demo.payload.response;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {
    private String token;
    private  String type;
    private String id;
    private String username;
    private String email;
    private List<String> roles;

    public  JwtResponse(){

    }

    public JwtResponse(String jwt, String id, String username, String email, List<String> roles) {
        this.token = jwt;
        this.type = "BEARER";
        this.id = id;
        this.username =username;
        this.email = email;
        this.roles = roles;
    }
}
