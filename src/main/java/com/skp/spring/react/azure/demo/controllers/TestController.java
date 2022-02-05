package com.skp.spring.react.azure.demo.controllers;

import com.skp.spring.react.azure.demo.rest.BaseController;
import com.skp.spring.react.azure.demo.rest.Response;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController extends BaseController {
    @GetMapping("/all")
    Response allAccess() {
        String content = "Public Content.";
        String message = "Resource successfully executed";
        return buildResponse(message,content);
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    Response userAccess() {
        String content = "User Content.";
        String message = "Resource successfully executed";
        return buildResponse(message,content);
    }
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    Response moderatorAccess() {
        String content = "Moderator Board.";
        String message = "Resource successfully executed";
        return buildResponse(message,content);
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    Response adminAccess() {
        String content = "Admin Board.";
        String message = "Resource successfully executed";
        return buildResponse(message,content);
    }
}