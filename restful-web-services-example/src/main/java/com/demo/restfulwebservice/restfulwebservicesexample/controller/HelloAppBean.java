package com.demo.restfulwebservice.restfulwebservicesexample.controller;

public class HelloAppBean {

    private String message;

    public HelloAppBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloAppBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
