package com.greenfox.jan.mysql.controllers;

import com.greenfox.jan.mysql.models.Assignee;
import com.greenfox.jan.mysql.repositories.AssigneeRepository;
import com.greenfox.jan.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private AssigneeRepository assigneeRepo;
    private ToDoRepository toDoRepo;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepo, ToDoRepository toDoRepo) {
        this.assigneeRepo = assigneeRepo;
        this.toDoRepo = toDoRepo;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAllByIdGreaterThanOrderById(0l));
        return "assignee/assigneelist";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("newAssignee", new Assignee());
        return "assignee/addAssignee";
    }

    @PostMapping("add")
    public String handleNewToDo(@ModelAttribute Assignee newAssignee){
        assigneeRepo.save(newAssignee);
        return "redirect:/assignee/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        assigneeRepo.deleteById(id);
        return "redirect:/assignee/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("editAssignee", assigneeRepo.findById(id).get());
        return "assignee/editAssignee";
    }

    @PostMapping("/edit")
    public String handleEditToDo(@ModelAttribute Assignee assignee){
        assigneeRepo.save(assignee);
        return "redirect:/assignee/";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id){
        model.addAttribute("assignee", assigneeRepo.findById(id).get());
        return "assignee/detailAssignee";
    }

    @RequestMapping("/search")
    public String displaySearch(Model model,@RequestParam String search) {
        model.addAttribute("assignees", assigneeRepo.findAllByNameLikeIgnoreCaseOrderById( "%" + search + "%"));
        return "assignee/searchedAssignee";
    }

}
