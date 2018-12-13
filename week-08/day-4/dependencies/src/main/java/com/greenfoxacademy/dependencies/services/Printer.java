package com.greenfoxacademy.dependencies.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(MyColor myColor) {
            myColor.printColor();

    }
}