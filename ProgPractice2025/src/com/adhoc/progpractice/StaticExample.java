package com.adhoc.progpractice;

public class StaticExample {
    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(obj.method()); // memory will be created at heap space
        System.out.println(StaticExample.method()); // meta space
        StaticExample.ageMethod();
    }

    public static void ageMethod() {
        int age = 0;
        age = age + 7;
        System.out.println(age);
    }

    protected static Boolean method() {
        while (true) {
            return true;
        }
    }


}
