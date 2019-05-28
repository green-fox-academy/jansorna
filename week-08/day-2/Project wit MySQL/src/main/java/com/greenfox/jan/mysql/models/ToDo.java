package com.greenfox.jan.mysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ToDo {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private boolean isUrgent = false;
    private boolean isDone = false;
    private LocalDateTime creationDate;

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
    }

    public ToDo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
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
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        this.isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
