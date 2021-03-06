package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.services.MyColor;
import com.greenfoxacademy.dependencies.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {


    @Autowired
    Printer printer;

    @Autowired
    @Qualifier("blue")
    MyColor color;


    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(color);
    }
}

