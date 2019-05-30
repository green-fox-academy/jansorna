package com.greenfox.jan.mysql.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String description;
    private boolean urgent = false;
    private boolean done = false;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    @ManyToOne()
    private Assignee assignee;

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
    }

    public ToDo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    @Override
    public String toString() {
        return title;
    }

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
