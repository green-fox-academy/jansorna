package com.greenfox.jan.mysql.services;

import com.greenfox.jan.mysql.models.ToDo;
import com.greenfox.jan.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    ToDoRepository repo;

    @Autowired
    public ToDoService(ToDoRepository repo) {
        this.repo = repo;
    }

    public List<ToDo> getAllToDos() {
        List<ToDo> allToDos = new ArrayList<>();
        repo.findAll().forEach(allToDos::add);
        return allToDos;
    }

    public List<ToDo> getUnFinished(List<ToDo> inputList) {
        return inputList.stream().filter(a -> !a.isDone()).collect(Collectors.toList());
    }

    public void addToDo(ToDo newToDo) {
        repo.save(newToDo);
    }

    public void deleteToDo(Long id) {
        repo.deleteById(id);
    }


}
