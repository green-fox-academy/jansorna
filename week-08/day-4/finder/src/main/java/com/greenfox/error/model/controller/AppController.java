package com.greenfox.error.model.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {

    private UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service=service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("yolos", service.getAll());
        return "main";
    }

    @PostMapping("/")
    public String create(@ModelAttribute User new_user) {
        service.save(new_user);
        return "redirect:/app/";
    }
}