package com.greenfoxacademy.bankofsymba.controller;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
    private Boolean king;

    public BankAccount(String name, Integer balance, String animalType, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = isKing;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Boolean getKing() {
        return king;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(Boolean itAKing) {
        king = itAKing;
    }
}
