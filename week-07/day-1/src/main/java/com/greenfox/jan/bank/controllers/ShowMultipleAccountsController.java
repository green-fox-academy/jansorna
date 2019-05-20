package com.greenfox.jan.bank.controllers;

import com.greenfox.jan.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowMultipleAccountsController {

    List<BankAccount> listOfAccounts = Arrays.asList(   new BankAccount("Simba", 2000, "lion"),
                                                        new BankAccount("Bimbo", 5000, "elephant"),
                                                        new BankAccount("Falker", 1000, "giraffe"),
                                                        new BankAccount("Pooh", 10000, "bear"),
                                                        new BankAccount("Elsa", 5000, "tiger"));

    @RequestMapping( path = "/showMultipleAccounts", method = RequestMethod.GET)
    public String displayAccount(Model model){
        model.addAttribute("listOfAccount", listOfAccounts);
        model.addAttribute("currency", "Zebra");
        return "showMultipleAccounts";
    }
}
