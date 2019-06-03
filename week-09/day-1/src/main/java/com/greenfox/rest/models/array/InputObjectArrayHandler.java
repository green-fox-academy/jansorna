package com.greenfox.rest.models.array;

public class InputObjectArrayHandler {
    private String what;
    private int[] numbers;

    public InputObjectArrayHandler() {
    }

    public InputObjectArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
