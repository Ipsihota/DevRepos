package com.adhoc.progpractice;

public class AutoBoxDemo {
    public static void main(String[] args) {
        show(10);
    }

    protected static void show(int i) {
        System.out.println("int : " + i);
    }

    protected static void show(Integer i) {
        System.out.println("Integer : " + i);
    }

    protected static void show(Long i) {
        System.out.println("Long : " + i);
    }

    protected static void show(long i) {
        System.out.println("long : " + i);
    }
}
