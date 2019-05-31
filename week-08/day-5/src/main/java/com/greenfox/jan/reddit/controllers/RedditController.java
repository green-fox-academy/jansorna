package com.greenfox.jan.reddit.controllers;

import com.greenfox.jan.reddit.models.RedditPost;
import com.greenfox.jan.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

    RedditRepo redditRepo;

    @Autowired
    public RedditController(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

    @GetMapping("/")
    public String showReddit(Model model){
        model.addAttribute("reddits", redditRepo.findAllByIdGreaterThanOrderByVotesDesc(0l));
        return "main";
    }

    @GetMapping("/add")
    public String add (Model model){
        model.addAttribute("reddit", new RedditPost());
        return "add";
    }

    @PostMapping("/add")
    public String handleAdd(@ModelAttribute RedditPost newPost){
        redditRepo.save(newPost);
        return "redirect:/";
    }

    @GetMapping("/{id}/plus")
    public String plus(@PathVariable long id){
        RedditPost post = redditRepo.findFirstById(id);
        post.setVotes(post.getVotes() + 1);
        redditRepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/minus")
    public String minus(@PathVariable long id){
        RedditPost post = redditRepo.findFirstById(id);
        post.setVotes(post.getVotes() - 1);
        redditRepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id){
        model.addAttribute("reddit", redditRepo.findFirstById(id));
        return "detail";
    }
}
