package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login2")
    public String login(){
        return "login2";
    }

    @PostMapping
    public String addUser(User user, Model model){
        model.addAttribute("userName",user.getUsername());
        return "user";
    }
}
