package com.adhoc.progpractice;

public interface InterfaceB {

    default void show()
    {
        System.out.println("B. Default Method Executed");
    }
}
