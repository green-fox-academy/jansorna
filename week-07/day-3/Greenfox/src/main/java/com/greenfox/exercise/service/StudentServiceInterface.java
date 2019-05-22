package com.greenfox.exercise.service;

import java.util.List;

public interface StudentServiceInterface {

    List<String> findAll();
    int count();
    boolean included(String name);
    void save(String student);

}
