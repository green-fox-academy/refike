package com.greenfoxacademy.foxclub.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public class Fox {
    String name;
    List<Trick> tricks;
    String food;
    String drink;

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrick (Trick trick){
        this.tricks.add(trick);
    }
}
