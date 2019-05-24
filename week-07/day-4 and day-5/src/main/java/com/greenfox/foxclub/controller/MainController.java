package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    FoxService foxService;

    @GetMapping("/")
    public String defaultPage(@RequestParam String name, Model model) {

            model.addAttribute("fox", foxService.findTheCorrectFox(name));
            model.addAttribute("trickList", foxService.findTheCorrectFox(name).getListOfTricks());

        model.addAttribute("path", name);
        return "index";
    }

    @GetMapping("/login")
    public String displayLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String handleName(@RequestParam String name) {
        if (foxService.ifFoxAlreadyExists(name)){
            return "redirect:/?name=" + name;
        } else {
           return "login";
        }
    }
}
