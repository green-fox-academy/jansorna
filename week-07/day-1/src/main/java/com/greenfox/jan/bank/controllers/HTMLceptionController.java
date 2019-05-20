package com.greenfox.jan.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HTMLceptionController {

    @RequestMapping( path = "/show/HTMLception", method = RequestMethod.GET)
    public String displayAccount(Model model){

        model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "hTMLception";
    }
}
