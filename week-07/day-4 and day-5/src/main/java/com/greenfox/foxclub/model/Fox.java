package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.List;


public class Fox {
    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;
    private String learnedTrick;

    public Fox() {
        this.listOfTricks = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        this.listOfTricks = new ArrayList<>();
    }

    public void addTrick(String trickName){
        this.listOfTricks.add(trickName);
    }

    //getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getLearnedTrick() {
        return learnedTrick;
    }

    public void setLearnedTrick(String learnedTrick) {
        this.learnedTrick = learnedTrick;
    }
}
