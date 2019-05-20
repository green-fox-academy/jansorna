package com.greenfox.jan.bank.controllers;

import com.greenfox.jan.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowController {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

    @RequestMapping( path = "/show", method = RequestMethod.GET)
    public String displayAccount(Model model){
        model.addAttribute("account", bankAccount);
        model.addAttribute("currency", "Zebra");
        return "index";
    }


}
