package com.databases.persistance;

import com.databases.persistance.models.Todo;
import com.databases.persistance.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistanceApplication implements CommandLineRunner {

    private ToDoRepository repo;

    @Autowired
    public PersistanceApplication(ToDoRepository repo) {
     this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(PersistanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("I have to learn Object Relational Mapping"));
        repo.save(new Todo("I have to learn Forms"));
        repo.save(new Todo("I have to learn HTML"));
    }
}
