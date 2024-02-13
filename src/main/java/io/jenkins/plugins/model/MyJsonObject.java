package io.jenkins.plugins.model;

public class MyJsonObject {

    private String message;
    private int number;

    public MyJsonObject() {

    }

    public MyJsonObject(String message, int number) {
        this.message = message;
        this.number = number;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
