package com.adhoc.progpractice.exception;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String s) {
//        System.out.println(s);
        super(s);
    }
}
