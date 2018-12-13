package com.greenfoxacademy.dependencies.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("it is green in colour");
    }
}
