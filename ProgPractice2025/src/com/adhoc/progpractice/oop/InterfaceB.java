package com.adhoc.progpractice.oop;

public interface InterfaceB {

    default void show()
    {
        System.out.println("B. Default Method Executed");
    }
}
