package org.fai.example.demo_sercurity_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AutheController {
    @GetMapping("token")
    public String GenerateToken(){
        return "Hello World";
    }
}
