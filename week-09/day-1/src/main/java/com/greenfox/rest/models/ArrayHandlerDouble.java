package com.greenfox.rest.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.lang.reflect.Array;

public class ArrayHandlerDouble {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int[] result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;

    public ArrayHandlerDouble(int[] numbers) {

        result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
