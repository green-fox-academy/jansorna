package com.dependancy.injection.exercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication implements CommandLineRunner {

    @Autowired
    Printer myPrinter;

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        myPrinter.log("hello");
    }
}
