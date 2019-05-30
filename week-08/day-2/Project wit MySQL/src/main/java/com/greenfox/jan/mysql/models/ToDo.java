package com.greenfox.jan.mysql.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean urgent = false;
    private boolean done = false;
    private LocalDateTime creationDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
