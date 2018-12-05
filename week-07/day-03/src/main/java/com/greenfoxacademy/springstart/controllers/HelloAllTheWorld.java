package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloAllTheWorld {

    @RequestMapping("/web/greetingTWO")
    public String greeting(Model model, @RequestParam String name) {
        HelloLanguage hello = new HelloLanguage();
        Greeting greet = new Greeting(name);
        model.addAttribute("name", greet.getContent());
        model.addAttribute("atomic", greet.getId());
        model.addAttribute("hello", hello.getHellos());
        model.addAttribute("fontSize", hello.getSize());
        model.addAttribute("fontColor", hello.getColor());

        return "greetingTWO";
    }

}
