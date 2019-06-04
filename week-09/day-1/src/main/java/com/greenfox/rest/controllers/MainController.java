package com.greenfox.rest.controllers;

import com.greenfox.rest.models.array.ArrayHandlerDouble;
import com.greenfox.rest.models.array.ArrayHandlerSumAndMultiply;
import com.greenfox.rest.models.doubling.Doubling;
import com.greenfox.rest.models.dountil.DoUntil;
import com.greenfox.rest.models.greeter.Greeter;
import com.greenfox.rest.models.array.InputObjectArrayHandler;
import com.greenfox.rest.models.dountil.InputObjectDoUntil;
import com.greenfox.rest.models.log.Log;
import com.greenfox.rest.models.log.LogCounter;
import com.greenfox.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Error;

@RestController
public class MainController {

    private LogRepository repo;

    @Autowired
    public MainController(LogRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam(required = false) Integer input) {
        repo.save(new Log("/Doubling", "input=" + String.valueOf(input)));
        return new Doubling(input);
    }

    @GetMapping("/greeter")
    public Greeter greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        repo.save(new Log("/greeter", "name=" + name + ";title=" + title));
        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public String append(@PathVariable String appendable) {
        repo.save(new Log("/appenda/{appendable}", "appendable=" + appendable));
        return "appended: " + appendable + "a";
    }

    @PostMapping("/dountil/{action}")
    public DoUntil doUntil(@PathVariable String action, @RequestBody(required = false) InputObjectDoUntil inputNumber) {
        repo.save(new Log("/dountil/{action}", "until=" + inputNumber));
        return new DoUntil(action, inputNumber.getUntil());
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) InputObjectArrayHandler inputObjectArrayHandler) {
        repo.save(new Log("arrays", "what=" + inputObjectArrayHandler.getWhat() + "numbers=" + inputObjectArrayHandler.getNumbers()));

        if (inputObjectArrayHandler.getWhat().isEmpty() || inputObjectArrayHandler.getNumbers() == null) {
            return new Error("Please provide what to do with the numbers!");
        } else if (inputObjectArrayHandler.getWhat().equals("double")) {
            return new ArrayHandlerDouble(inputObjectArrayHandler.getNumbers());
        } else {
            return new ArrayHandlerSumAndMultiply(inputObjectArrayHandler.getWhat(), inputObjectArrayHandler.getNumbers());
        }
    }

    @GetMapping("/log")
    public LogCounter log() {
        return new LogCounter(repo.findAll(), "entry_count: " + repo.count());
    }

}
