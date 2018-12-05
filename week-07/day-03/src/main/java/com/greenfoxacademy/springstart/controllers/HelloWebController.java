package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name, Greeting greet) {
        model.addAttribute("name", name);
        model.addAttribute("atomic", greet.getId());
        return "greeting";
    }

}
