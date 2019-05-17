package com.example.demo.controllers;

import com.example.demo.models.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebShopController {

    ShopItemStore myStore = new ShopItemStore();

    @RequestMapping()
    public String basicWebShopWithoutAnything(Model model) {
        model.addAttribute("items", myStore.getShopItemsList());
        return "viewWithTable";
    }

    @RequestMapping("/webshop")
    public String basicWebShop(Model model) {
        model.addAttribute("items", myStore.getShopItemsList());
        return "viewWithTable";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", myStore.filterOnlyAvailAble());
        return "viewWithTable";
    }

    @RequestMapping("/cheapest-first")
    public String sortFromCheapest(Model model) {
        model.addAttribute("items", myStore.sortFromCheapest());
        return "viewWithTable";
    }

    @RequestMapping("/contains-nike")
    public String displayContainsNike(Model model) {
        model.addAttribute("items", myStore.containsNike());
        return "viewWithTable";
    }

    @RequestMapping("/average-stock")
    public String displayAverageStock(Model model) {
        model.addAttribute("average", myStore.getAverageStock());
        return "viewWithoutTable";
    }

    @RequestMapping("/most-expensive")
    public String displayNameOfMostExpensiveItem(Model model) {
        model.addAttribute("name", myStore.getNameOfMostExpensive());
        return "viewWithMostExpensiveItem";
    }

    @RequestMapping("/search")
    public String displaySearch(Model model,@RequestParam String search) {
        model.addAttribute("items", myStore.searchForWord(search));
        return "viewWithTable";
    }
}
