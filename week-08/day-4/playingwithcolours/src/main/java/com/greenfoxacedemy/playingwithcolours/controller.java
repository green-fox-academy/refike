package com.greenfoxacedemy.playingwithcolours;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Autowired
    @Qualifier("red")
    MyColor redColor;

    @Autowired
    @Qualifier("blue")
    MyColor blueColor;

    @RequestMapping("/")
    @ResponseBody
    public void coloring() {
        redColor.printColor();
        blueColor.printColor();
    }
}
