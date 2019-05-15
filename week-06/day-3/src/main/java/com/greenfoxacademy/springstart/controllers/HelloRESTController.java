package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greenfoxacademy.springstart.SpringstartApplication;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")

    public Greeting greetingMethod(){
        return new Greeting(1, SpringstartApplication.hello());
    }
}
