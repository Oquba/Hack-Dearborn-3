package com.yofyt.yofy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterForm() {
        return "register";
    }
}
