package com.greenfoxacademy.exercisetwo.Controllers;

import com.greenfoxacademy.exercisetwo.Repository.TodoRepository;
import com.greenfoxacademy.exercisetwo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/todo")
public class Todocontroller {

    private TodoRepository todoRepository;

    @Autowired
    public Todocontroller(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping({"","/","/list"})
    public String list(Model model, @RequestParam(name="isActive", required = false)Boolean isActive){
        if(isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        }else if (isActive == true) {
            model.addAttribute("todos",todoRepository.findByDone(!isActive));
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String addTodo(Model model, @ModelAttribute(name="mytodo") Todo todo) {
        model.addAttribute("mytodo", todo);
        return "createtodo";
    }

    @PostMapping ("/add")
    public String postTodo(@ModelAttribute(name="mytodo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable long id){

        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if(optionalTodo.isPresent()) {
            model.addAttribute("edittodo", optionalTodo.get());
        }else {
            model.addAttribute("edittodo", new Todo());
        }

        return "edit";
    }


    @PostMapping ("/{id}/edit")
    public String postEdit (@ModelAttribute("edittodo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

}
