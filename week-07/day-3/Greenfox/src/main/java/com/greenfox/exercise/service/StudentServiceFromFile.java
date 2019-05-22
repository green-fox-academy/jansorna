package com.greenfox.exercise.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("fromFile")
public class StudentServiceFromFile implements StudentServiceInterface {
    List<String> names;

    public StudentServiceFromFile() {
        this.names = new ArrayList<>();
        names = readTheFile();
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public int count() {
        return names.size();
    }

    @Override
    public boolean included(String name) {
        return names.contains(name);
    }

    @Override
    public void save(String student) {
        names.add(student);
        try {
        Path filePath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-07\\day-3\\Greenfox\\src\\main\\java\\com\\greenfox\\exercise\\service\\names.txt");
        Files.write(filePath, names);
    } catch (Exception e) {
        System.out.println("Something wrong with writing to the file!");
    }
}

    public static List<String> readTheFile() {

        Path filePath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-07\\day-3\\Greenfox\\src\\main\\java\\com\\greenfox\\exercise\\service\\names.txt");
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Something wrong with reading from the file!");
        }
        return content;
    }
}
