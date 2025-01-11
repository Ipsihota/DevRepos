package com.adhoc.progpractice.exception;

public class A {
    public void m1() throws ArrayIndexOutOfBoundsException{
        System.out.println("Inside class A");
    }
}

class B extends A {
    public void m1() throws RuntimeException{
        System.out.println("Inside class B");
    }
}
