package com.greenfox.rest.controllers;

import com.greenfox.rest.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @GetMapping("/doubling")
    public String doubling(@RequestParam(required = false) Integer input){
        if (input != null) {
            return "{received: " + input + "," + "result: " + input * 2 + "}";
        } else {
            return "error: Please provide an input!";
        }
    }

    @GetMapping("/greeter")
    public Greeter greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
        return new Greeter(name, title);
    }
}
