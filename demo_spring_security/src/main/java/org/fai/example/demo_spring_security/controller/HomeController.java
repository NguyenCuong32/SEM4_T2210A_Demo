package org.fai.example.demo_spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Index()
    {
        return "index";
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
