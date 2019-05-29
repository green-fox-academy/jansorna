package com.greenfox.jan.mysql.controllers;

import com.greenfox.jan.mysql.models.ToDo;
import com.greenfox.jan.mysql.repositories.ToDoRepository;
import com.greenfox.jan.mysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

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
            model.addAttribute("active", true);
        } else {
            model.addAttribute("todos", repo.findAll());
            model.addAttribute("active", false);

        }
        return "todolist";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("newToDo", new ToDo());
        return "add";
    }

    @PostMapping("add")
    public String handleNewToDo(@ModelAttribute ToDo newToDo){
        newToDo.setCreationDate(LocalDateTime.now());
        repo.save(newToDo);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        repo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("editToDo", repo.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String handleEditToDo(@ModelAttribute ToDo editToDo){
        editToDo.setCreationDate(LocalDateTime.now());
        repo.save(editToDo);
        return "redirect:/";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id){
        model.addAttribute("todo", repo.findById(id).get());
        return "detail";
    }
}
