package com.greenfoxacademy.springstart.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    @RequestMapping (value="/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting("Hello, " + name);
    }
}
