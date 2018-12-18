package com.greenfoxacademy.foxclub.Models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
List<Fox> foxes;

    public FoxService() {
        this.foxes = new ArrayList<>();
    }


    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void addFox(String name) {
        Fox fox = new Fox(name, null, null);
        if (findFox(name) == null) {
            foxes.add(fox);
        }
    }

    public Fox findFox(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }
}
