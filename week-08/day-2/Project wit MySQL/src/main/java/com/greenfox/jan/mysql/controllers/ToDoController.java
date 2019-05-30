package com.greenfox.jan.mysql.controllers;

import com.greenfox.jan.mysql.models.ToDo;
import com.greenfox.jan.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoRepository repo;

    @Autowired
    public ToDoController(ToDoRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", repo.findAllByDoneIsFalseOrderById());
            model.addAttribute("active", true);
        } else {
            model.addAttribute("todos", repo.findAllByIdGreaterThanOrderById(0l));
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
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        repo.deleteById(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("editToDo", repo.findById(id).get());
        return "edit";
    }

    @PostMapping("/edit")
    public String handleEditToDo(@ModelAttribute ToDo editToDo){
        editToDo.setCreationDate(LocalDateTime.now());
        repo.save(editToDo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id){
        model.addAttribute("todo", repo.findById(id).get());
        return "detail";
    }

    @RequestMapping("/search")
    public String displaySearch(Model model,@RequestParam String search) {
        model.addAttribute("todos", repo.findAllByTitleLikeIgnoreCaseOrderById( "%" + search + "%"));
        model.addAttribute("active", false);
        return "searchedlist";
    }
}
