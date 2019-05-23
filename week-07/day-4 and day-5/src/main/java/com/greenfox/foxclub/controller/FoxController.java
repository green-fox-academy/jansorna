package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Service
public class FoxController {

    private List<Fox> foxList;
    private String nameOfPet;
    List<Fox> theChosenFox;

    public FoxController() {
        this.foxList = new ArrayList<>();
        this.theChosenFox = new ArrayList<>();
        foxList = initializeListOfFoxes();
    }

    private List<Fox> initializeListOfFoxes() {
        foxList.add(new Fox("Mr.Green"));
        foxList.add(new Fox("Mr.Claw"));
        foxList.add(new Fox("Mr.Fur"));
        foxList.add(new Fox("Mr.Tail"));
        foxList.add(new Fox("Mr.Wise"));

        return foxList;
    }

    @GetMapping("/nutritionStore")
    public String nutritionStore(@RequestParam String name, Model model) {
        this.theChosenFox = foxList.stream()
                .filter(a -> a.getName().equals(name))
                .collect(Collectors.toList()); //find find fox by name

        nameOfPet = name;

        model.addAttribute("fox", theChosenFox.get(0));
        //model.addAttribute("nameOfPet", nameOfPet); - poslu do html name a d8m ho do th:action s @/... a pak v post m8m Request param

        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String handleStore(@ModelAttribute Fox fox, RedirectAttributes redirectAttributes) {
        theChosenFox.get(0).setFood(fox.getFood());
        theChosenFox.get(0).setDrink(fox.getDrink());
        redirectAttributes.addAttribute("name", nameOfPet);
        return "redirect:/";
    }

    @GetMapping("/trickCenter")
    public String trickCenter(@RequestParam String name, Model model) {
        this.theChosenFox = foxList.stream()
                .filter(a -> a.getName().equals(name))
                .collect(Collectors.toList());

        nameOfPet = name;

        model.addAttribute("fox", theChosenFox.get(0));

        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String handleCenter(@ModelAttribute Fox fox, RedirectAttributes redirectAttributes) {
        theChosenFox.get(0).addTrick(fox.getLearnedTrick());
        redirectAttributes.addAttribute("name", nameOfPet);
        return "redirect:/";
    }

    // getters and setters
    public List<Fox> getFoxList() {
        return foxList;
    }

    public void setFoxList(List<Fox> foxList) {
        this.foxList = foxList;
    }

    public void addFox (Fox addedFox){
        this.foxList.add(addedFox);
    }
}
