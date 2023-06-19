package com.bindstone.weblog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhoAmiContoller {

    @GetMapping("/whoami")
    public ResponseEntity<String> greeting(Authentication authentication) {
        String userName = authentication.getName();
        return ResponseEntity.ok(userName);
    }
}