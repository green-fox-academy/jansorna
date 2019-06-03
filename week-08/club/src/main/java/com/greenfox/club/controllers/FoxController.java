package com.greenfox.club.controllers;

import com.greenfox.club.model.Enums;
import com.greenfox.club.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    @Autowired
    FoxService foxService;

    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model) {
        model.addAttribute("meals", Enums.meals.values());
        model.addAttribute("drinks", Enums.drinks.values());
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String handleStore(@RequestParam String name, @RequestParam String meal, @RequestParam String drink) {
        foxService.findTheCorrectFox(name).setMeal(meal);
        foxService.findTheCorrectFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String trickCenter(Model model) {
        model.addAttribute("tricks", Enums.tricks.values());
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String handleCenter(@RequestParam String name, @RequestParam String trick) {
        foxService.findTheCorrectFox(name).addTrick(trick);
        return "redirect:/?name=" + name;
    }
}
