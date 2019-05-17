package com.example.demo.controllers;

import com.example.demo.models.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebShopController {

    @RequestMapping("/webshop")
    public String basicWebShop(Model model) {
        ShopItemStore myStore = new ShopItemStore();
        model.addAttribute("items", myStore.getShopItemsList());
        return "shopViewWithTable";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model) {
        ShopItemStore myStore = new ShopItemStore();
        model.addAttribute("items", myStore.filterOnlyAvailAble());
        return "shopViewWithTable";
    }

    @RequestMapping("/cheapest-first")
    public String sortFromCheapest(Model model) {
        ShopItemStore myStore = new ShopItemStore();
        model.addAttribute("items", myStore.sortFromCheapest());
        return "shopViewWithTable";
    }

    @RequestMapping("/contains-nike")
    public String displayContainsNike(Model model) {
        ShopItemStore myStore = new ShopItemStore();
        model.addAttribute("items", myStore.containsNike());
        return "shopViewWithTable";
    }

    @RequestMapping("/average-stock")
    public String displayAverageStock(Model model) {
        ShopItemStore myStore = new ShopItemStore();
        model.addAttribute("average", myStore.getAverageStock());
        return "shopViewWithoutTable";
    }
}
