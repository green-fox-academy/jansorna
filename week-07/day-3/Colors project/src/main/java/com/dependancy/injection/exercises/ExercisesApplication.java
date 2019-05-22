package com.dependancy.injection.exercises;

import com.dependancy.injection.exercises.service.color.and.implementations.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication implements CommandLineRunner {

    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        myColor.printColor();
    }
}
