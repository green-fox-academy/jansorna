package com.greenfox.jan.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("")
    public String login(){
        return "login";
    }

    @PostMapping("")
    public String handleLogin(@RequestParam String username){
        return "redirect:/1";
    }
}
