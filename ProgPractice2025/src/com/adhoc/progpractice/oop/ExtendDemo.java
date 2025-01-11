package com.adhoc.progpractice.oop;

public class ExtendDemo {
    public static void main(String[] args) {
//        ExtendedClass ec = new BaseClass();
        BaseClass baseClass = new ExtendedClass();
        ExtendedClass ec = new ExtendedClass();
        baseClass.method(5);
        ec.method();
    }
}
