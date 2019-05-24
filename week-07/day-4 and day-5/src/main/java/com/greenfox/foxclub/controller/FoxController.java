package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Enums;
import com.greenfox.foxclub.services.FoxService;
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
        foxService.findTheCorrectFox(name).setFood(meal);
        foxService.findTheCorrectFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String trickCenter() {
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String handleCenter(@RequestParam String name, @RequestParam String learnedTrick) {
        foxService.findTheCorrectFox(name).addTrick(learnedTrick);
        return "redirect:/?name=" + name;
    }
}
