package com.greenfoxacademy.listingtodos.Controllers;

import com.greenfoxacademy.listingtodos.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class Todocontroller {

    private TodoRepository todoRepository;

    @Autowired
    public Todocontroller(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping({"","/","/list"})
    public String list(Model model){
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }
}
