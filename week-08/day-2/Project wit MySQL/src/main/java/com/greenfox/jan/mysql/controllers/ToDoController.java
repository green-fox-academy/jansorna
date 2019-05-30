package com.greenfox.jan.mysql.controllers;

import com.greenfox.jan.mysql.models.Assignee;
import com.greenfox.jan.mysql.models.ToDo;
import com.greenfox.jan.mysql.repositories.AssigneeRepository;
import com.greenfox.jan.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoRepository toDoRepo;
    private AssigneeRepository assigneeRepo;

    @Autowired
    public ToDoController(ToDoRepository toDoRepo, AssigneeRepository assigneeRepo) {
        this.toDoRepo = toDoRepo;
        this.assigneeRepo = assigneeRepo;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", toDoRepo.findAllByDoneIsFalseOrderById());
            model.addAttribute("active", true);
        } else {
            model.addAttribute("todos", toDoRepo.findAllByIdGreaterThanOrderById(0l));
            model.addAttribute("active", false);
        }
        return "todo/todolist";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("newToDo", new ToDo());
        return "todo/add";
    }

    @PostMapping("add")
    public String handleNewToDo(@ModelAttribute ToDo newToDo){
        newToDo.setCreationDate(LocalDateTime.now());
        toDoRepo.save(newToDo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        toDoRepo.deleteById(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("editToDo", toDoRepo.findById(id).get());
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "todo/edit";
    }

    @PostMapping("/edit")
    public String handleEditToDo(@ModelAttribute ToDo editToDo){
        editToDo.setCreationDate(LocalDateTime.now());
        toDoRepo.save(editToDo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id){
        model.addAttribute("todo", toDoRepo.findById(id).get());
        return "todo/detail";
    }

    @RequestMapping("/search")
    public String displaySearch(Model model,@RequestParam String search) {
        model.addAttribute("todos", toDoRepo.findAllByTitleLikeIgnoreCaseOrderById( "%" + search + "%"));
        model.addAttribute("active", false);
        return "todo/searchedlist";
    }
}
