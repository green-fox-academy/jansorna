package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class MainController {

    @Autowired
    FoxController myFoxControllers;

    @GetMapping("/")
    public String defaultPage(@RequestParam String name, Model model) {

        List<String> namesOfExistingFoxes = myFoxControllers.getFoxList().stream()
                                            .map(a -> a.getName())
                                            .collect(Collectors.toList());
        List<Fox> theChosenFox = myFoxControllers.getFoxList().stream()
                .filter(a -> a.getName().equals(name))
                .collect(Collectors.toList());

        //findfirst -> optional (maybe fox ) if present a pokracovat

        if (namesOfExistingFoxes.contains(name)) {
            model.addAttribute("fox", theChosenFox.get(0));
            model.addAttribute("trickList", theChosenFox.get(0).getListOfTricks());

        } else {
            Fox myFox = new Fox(name);
            myFoxControllers.addFox(myFox);
            model.addAttribute("fox", myFox);
            model.addAttribute("trickList", myFox.getLearnedTrick());
        }

        model.addAttribute("url", name); //prejmenovat
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
