package com.greenfox.jan.mysql.controllers;

import com.greenfox.jan.mysql.repositories.ToDoRepository;
import com.greenfox.jan.mysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/todo")
@Controller
public class ToDoController {

    private ToDoRepository repo;
    private ToDoService service;

    @Autowired
    public ToDoController(ToDoRepository repo, ToDoService service) {
        this.repo = repo;
        this.service = service;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", service.getUnFinished(service.getAllToDos()));
        } else {
            model.addAttribute("todos", service.getAllToDos());
        }
        return "todolist";
    }
}
