package com.greenfox.jan.bank.model;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;

    public BankAccount() {
    }

    private boolean isGood;

    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing) {
        this(name, balance, animalType);
        this.isKing = isKing;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
        this(name, balance, animalType, isKing);
        this.isGood = isGood;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
