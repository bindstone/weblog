package com.bindstone.weblog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}