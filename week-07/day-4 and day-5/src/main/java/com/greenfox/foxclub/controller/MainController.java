package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.service.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List<Fox> foxList = new ArrayList<>();

    @GetMapping("/")
    public String defaultPage(@RequestParam String name, Model model) {
        Fox myFox = new Fox(name);
        foxList.add(myFox);
        model.addAttribute("fox", myFox);
        return "index";
    }

    @GetMapping("/login")
    public String displayLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String handleName(@RequestParam String name, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }
}
