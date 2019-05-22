package com.dependancy.injection.exercises.controller;

import com.dependancy.injection.exercises.service.utility.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    UtilityService myUtilityService;

    @GetMapping("/useful")
    public String displayUsefulPage() {
        return "mainPage";
    }

    @GetMapping("/useful/colored")
    public String displayColoredPage(Model model) {
        model.addAttribute("backgroungColor", "background-color:" + myUtilityService.randomColor());
        return "coloredPage";
    }

    @GetMapping("/useful/email")
    public String validateEmail(Model model, @RequestParam String email) {
        model.addAttribute("inspectedEmailAddress", myUtilityService.validateEmail(email));
        model.addAttribute("emailAddress", email);
        return "emailValidation";
    }

    @GetMapping("/useful/code")
    public String ceasarCoding(Model model, @RequestParam String code,@RequestParam int number) {
        model.addAttribute("code", myUtilityService.caesar(code, number));
        return "codingAndDecoding";
    }

}
