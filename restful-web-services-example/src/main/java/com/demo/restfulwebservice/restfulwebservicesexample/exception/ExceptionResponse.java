package com.demo.restfulwebservice.restfulwebservicesexample.exception;

import java.util.Date;

public class ExceptionResponse {
    private Date timeStampTest;
    private String message;
    private String details;

    public ExceptionResponse(Date timeStampTest, String message, String details) {
        this.timeStampTest = timeStampTest;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStampTest() {
        return timeStampTest;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
