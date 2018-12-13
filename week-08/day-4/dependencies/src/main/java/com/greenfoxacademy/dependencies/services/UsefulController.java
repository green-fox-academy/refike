package com.greenfoxacademy.dependencies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulController {
    private UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful/colored")
    public String randomColBackground (Model model){
        model.addAttribute("random" , utilityService.randomColor());
        return "randombackground";
    }

    @GetMapping("/useful/{email}")
    public String validEmail(Model model, @PathVariable(name="email") String email){
    utilityService.validEmail(email);
    return
    }
}
