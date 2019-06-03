package com.greenfox.rest.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ArrayHandlerSumAndMultiply {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public ArrayHandlerSumAndMultiply(String what, int[] numbers) {
        if (what.equals("sum")) {
            result = 0;
            for (int number : numbers) {
                result += number;
            }
        } else if (what.equals("multiply")) {
            result = 1;
            for (int number : numbers) {
                result *= number;
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
