package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    public static AtomicLong id = new AtomicLong();
    private String content;

    public Greeting(String content) {
        this.content = content;
        id.getAndIncrement();
    }

    public AtomicLong getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
