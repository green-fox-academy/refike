package com.greenfoxacademy.dependencies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsefulController {
     private UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }


    @GetMapping("/useful")
    public String showBaseTwo(Model model) {
        model.addAttribute("email", utilityService.email);

        model.addAttribute("text1", utilityService.first);
        model.addAttribute("int1", utilityService.myint);
        return "main";
    }

    @GetMapping("/useful/colored")
    public String randomColBackground(Model model) {
        model.addAttribute("random", utilityService.randomColor());
        return "randombackground";
    }

    @GetMapping("/useful/email")
    public String validEmail(Model model, @RequestParam String email) {
        model.addAttribute("isvalid", utilityService.validEmail(email));
        model.addAttribute("emailaddress", email);
        return "email";
    }

    @PostMapping("/useful/ceasar")
    public String validEmail(Model model, @ModelAttribute (name = "text") String text, @ModelAttribute (name ="num")Integer number) {
        model.addAttribute("ceasar", utilityService.caesar(text, number));
        return "ceasar";

    }
}
