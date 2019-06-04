package com.greenfox.rest.models.doubling;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Doubling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer received;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public Doubling(Integer received) {
        if (received == null) {
            this.error = "Please provide an input!";
        } else {
            this.received = received;
            this.result = received * 2;
        }
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
