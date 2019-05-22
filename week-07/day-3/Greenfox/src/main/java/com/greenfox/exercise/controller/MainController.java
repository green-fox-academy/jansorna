package com.greenfox.exercise.controller;

import com.greenfox.exercise.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    @Qualifier("fromFile")
    StudentServiceInterface myService;

    @GetMapping("/gfa")
    public String displayGfaPage(Model model) {
        model.addAttribute("count", myService.count());
        return "mainPage";
    }
    @GetMapping("/gfa/list")
    public String displayListOfStudents(Model model) {
        model.addAttribute("listOfStudents", myService.findAll());
        return "listOfStudents";
    }

    @GetMapping("/gfa/add")
    public String addStudentForm() {
        return "addStudent";
    }

    @GetMapping("/gfa/add/save")
    public String addStudent(@RequestParam String name) {
        myService.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("/gfa/check")
    public String checkStudent() {
        return "checkStudent";
    }

    @GetMapping("/gfa/checkifincluded")
    @ResponseBody
    public String checkIfIncludedStudent(@RequestParam String name) {
        if (myService.included(name)){
            return name + " is in the list!";
        }return name + " is not in the list!";
    }
}
