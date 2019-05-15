package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greetingMethod(@RequestParam String name) {
        int counter = 0;
        counter++;
        return new Greeting(counter, name);
    }
}
