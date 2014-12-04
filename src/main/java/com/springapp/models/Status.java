package com.springapp.models;

/**
 * Created by alexfernandezwhiteskylabs on 12/4/14.
 */
public class Status {

    private int code;
    private String message;

    public Status() {
    }

    public Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
