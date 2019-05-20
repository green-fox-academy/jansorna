package com.greenfox.jan.bank.controllers;

import com.greenfox.jan.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowMultipleAccountsController {

    List<BankAccount> listOfAccounts = new ArrayList<>();

    public ShowMultipleAccountsController() {
        listOfAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        listOfAccounts.add(new BankAccount("Bimbo", 5000, "elephant", false));
        listOfAccounts.add(new BankAccount("Falker", 1000, "giraffe", false, true));
        listOfAccounts.add(new BankAccount("Pooh", 10000, "bear", false));
        listOfAccounts.add(new BankAccount("Elsa", 5000, "tiger", false, true));
    }

    @RequestMapping(path = "/showMultipleAccounts", method = RequestMethod.GET)
    public String displayAccount(Model model) {
        model.addAttribute("listOfAccount", listOfAccounts);
        model.addAttribute("currency", "Zebra");
        model.addAttribute("shiny", "color: gold");
        model.addAttribute("goodOne", "Good one");
        model.addAttribute("badOne", "Bad guy");
        model.addAttribute("bankAccount", new BankAccount());
        model.addAttribute("bankAccountTwo", new BankAccount());
        return "showMultipleAccounts";
    }

    @PostMapping("/handle-the-form")
    public String handle(@ModelAttribute BankAccount bankAccount, Model model) {
        listOfAccounts.stream()
                .filter(a -> a.getName().equals(bankAccount.getName()))
                .forEach(ShowMultipleAccountsController::incrementInEveryCase);
        return "redirect:/showMultipleAccounts";
    }

    @PostMapping("/addAccount")
    public String addAccount(@ModelAttribute BankAccount bankAccount, Model model) {
        listOfAccounts.add(bankAccount);
        return "redirect:/showMultipleAccounts";
    }

    private static void incrementInEveryCase(BankAccount account) {
        if (account.isKing()) {
            account.setBalance(account.getBalance() + 100);
        } else {
            account.setBalance(account.getBalance() + 10);
        }
    }
}
