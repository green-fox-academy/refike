package com.greenfoxacademy.exercisetwo;

import com.greenfoxacademy.exercisetwo.Repository.TodoRepository;
import com.greenfoxacademy.exercisetwo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisetwoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public ExercisetwoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExercisetwoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo());
        todoRepository.save(new Todo("Feed the dog",false,true));
        todoRepository.save(new Todo("Make the bed",false,false));
        todoRepository.save(new Todo("Do the shopping",true,true));
        todoRepository.save(new Todo("Watch TV",false,false));
        todoRepository.save(new Todo("Buy some weed",true,true));

    }
}

