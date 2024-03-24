package com.ecc.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
    
    @GetMapping("/ping")
    public String initTeste(){
        return "pong";
    }
}
