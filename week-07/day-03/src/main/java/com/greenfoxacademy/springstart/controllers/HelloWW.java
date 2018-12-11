package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWW {

    @RequestMapping("/web/greeting1")
    public String greeting(Model model) {
        model.addAttribute("cica", " World");
        return "greet";
    }
}
