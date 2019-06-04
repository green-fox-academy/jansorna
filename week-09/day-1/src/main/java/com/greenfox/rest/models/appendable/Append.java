package com.greenfox.rest.models.appendable;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Append {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appended;

    public Append() {
    }

    public Append(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
