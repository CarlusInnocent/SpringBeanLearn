package com.example.SpringBeanLearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String Login() {

        return "login.html";
    }
}
