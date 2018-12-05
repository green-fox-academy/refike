package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static AtomicLong atlon = new AtomicLong(1);
    long id;
    String content;

    public Greeting(String content) {
        this.id = atlon.getAndIncrement();
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
