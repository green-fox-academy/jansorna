package com.greenfox.jan.mysql.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ToDo> todos;

    public Assignee() {
    }
    public Assignee(String name) {
        this.name = name;
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addToDo(ToDo addedToDo){
        addedToDo.setAssignee(this);
        this.todos.add(addedToDo);
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
