package com.example.demo.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItemStore {
    private List<ShopItem> shopItemsList;

    public ShopItemStore() {
        initializeList();
    }

    public List<ShopItem> getShopItemsList() {
        return shopItemsList;
    }

    public void initializeList() {
        List<ShopItem> shopItemsList = new ArrayList<>();

        ShopItem runningshoes = new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000, 5);
        ShopItem printer = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
        ShopItem cocaCola = new ShopItem("Coca cola", "0.5 standard coke", 25, 0);
        ShopItem wokin = new ShopItem("Wokin", "Chicken with fried rice and WOKIN suace", 119, 100);
        ShopItem tshirt = new ShopItem("Tshirt", "Blue with corgi on a bike", 300, 1);

        shopItemsList.add(runningshoes);
        shopItemsList.add(printer);
        shopItemsList.add(cocaCola);
        shopItemsList.add(wokin);
        shopItemsList.add(tshirt);

        this.shopItemsList = shopItemsList;
    }

    public List<ShopItem> filterOnlyAvailAble() {
        return shopItemsList.stream()
                .filter(a -> a.getStockQuantity() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortFromCheapest() {
        return shopItemsList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return shopItemsList.stream()
                .filter(a -> a.getDescription().contains("nike") || a.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }

    public List<ShopItem> searchForWord(String word) {
        return shopItemsList.stream()
                .filter(a -> a.getDescription().contains(word) || a.getName().contains(word))
                .collect(Collectors.toList());
    }

    public double getAverageStock() {
        return shopItemsList.stream()
                .map(a -> a.getStockQuantity())
                .collect(Collectors.averagingDouble(Integer::intValue));
    }

    public String getNameOfMostExpensive() {
        return shopItemsList.stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .map(a -> a.getName())
                .get();
    }
}