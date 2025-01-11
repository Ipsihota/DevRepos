package com.adhoc.progpractice.oop;

public interface InterfaceA {

    // abstract method
    public void square(int a);

    default void show()
    {
        System.out.println("A. Default Method Executed");
    }
}
