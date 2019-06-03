package com.greenfox.rest.controllers;

import com.greenfox.rest.models.ArrayHandlerDouble;
import com.greenfox.rest.models.DoUntil;
import com.greenfox.rest.models.Greeter;
import com.greenfox.rest.models.ArrayHandlerSumAndMultiply;
import com.greenfox.rest.models.receivedFromREST.InputObjectArrayHandler;
import com.greenfox.rest.models.receivedFromREST.InputObjectDoUntil;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/appenda/{appendable}")
    public String append(@PathVariable String appendable){
        return "appended: " + appendable + "a";
    }

    @PostMapping("/dountil/{action}")
    public DoUntil doUntil(@PathVariable String action, @RequestBody(required = false) InputObjectDoUntil inputNumber){
        return new DoUntil(action, inputNumber.getUntil());
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) InputObjectArrayHandler inputObjectArrayHandler){

        if (inputObjectArrayHandler.getWhat().isEmpty() || inputObjectArrayHandler.getNumbers() == null){
            return new Error("Please provide what to do with the numbers!");
        } else if(inputObjectArrayHandler.getWhat().equals("double")){
            return new ArrayHandlerDouble(inputObjectArrayHandler.getNumbers());
        } else {
            return new ArrayHandlerSumAndMultiply(inputObjectArrayHandler.getWhat(), inputObjectArrayHandler.getNumbers());
        }
    }

}
