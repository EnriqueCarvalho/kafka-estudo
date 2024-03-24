package com.ecc.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecc.producer.MensagemService;

@RestController
@RequestMapping("/api")
public class InitController {

    @Autowired
    private MensagemService mensagemService;
    
    @GetMapping("/ping")
    public String initTeste(){
        return "pong";
    }

    @PostMapping("/send")
    public String sendMessagem(@RequestBody String reqBody){
        mensagemService.sendMessage(reqBody);
        return "Mensagem enviado com sucesso";
    }
}
