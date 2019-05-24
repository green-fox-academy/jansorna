package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Enums;
import com.greenfox.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FoxController {

    @Autowired
    FoxService foxService;

    @GetMapping("/nutritionStore")
    public String nutritionStore(@RequestParam String name, Model model) {

        foxService.setNameOfPet(name);

        model.addAttribute("meals", Enums.meals.values());
        model.addAttribute("drinks", Enums.drinks.values()); //poslu do html name a d8m ho do th:action s @/... a pak v post m8m Request param

        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String handleStore(@RequestParam String meal, @RequestParam String drink, RedirectAttributes redirectAttributes) {
        foxService.findTheCorrectFox(foxService.getNameOfPet()).setFood(meal);
        foxService.findTheCorrectFox(foxService.getNameOfPet()).setDrink(drink);
        redirectAttributes.addAttribute("name", foxService.getNameOfPet());
        return "redirect:/";
    }

    @GetMapping("/trickCenter")
    public String trickCenter(@RequestParam String name, Model model) {
        foxService.setNameOfPet(name);
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String handleCenter(@RequestParam String learnedTrick, RedirectAttributes redirectAttributes) {
        foxService.findTheCorrectFox(foxService.getNameOfPet()).addTrick(learnedTrick);
        redirectAttributes.addAttribute("name", foxService.getNameOfPet());
        return "redirect:/";
    }
}
