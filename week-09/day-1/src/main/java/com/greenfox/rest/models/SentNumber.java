package com.greenfox.rest.models;

public class SentNumber {

    private Integer until;

    public SentNumber() {
    }

    public SentNumber(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
