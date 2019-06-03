package com.greenfox.rest.models.dountil;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DoUntil {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;


    public DoUntil(String action, Integer number) {

        if (number == null) {
            this.error = "Please provide a number!";
        } else if(action.equals("sum")){
            result = 0;
            for (int i = 1; i <= number; i++) {
                result += i;
            }
        } else if (action.equals("factor")){
            result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
        }
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
