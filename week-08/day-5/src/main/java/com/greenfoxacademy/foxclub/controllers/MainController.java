package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.Models.Fox;
import com.greenfoxacademy.foxclub.Models.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String baseview(Model model, @RequestParam ("foxy") String name ){
        model.addAttribute("broxy",name);
        return "index";
    }

    @GetMapping("/login")
    public String addFox(){
    return "login";
    }


    @PostMapping("/login")
    public String addFoxTwo(Model model , @RequestParam (name="fox1") String name) {
        if(name == ""){
            return "redirect:/login";
        }
        else  {
            foxService.addFox(name);
            System.out.println(foxService.getFoxes().size());
            return "redirect:/?foxy=" + name;
        }

    }
}
