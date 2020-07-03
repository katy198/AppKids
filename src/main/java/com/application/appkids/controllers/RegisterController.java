package com.application.appkids.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Registration Page");
        return "register";
    }
}
