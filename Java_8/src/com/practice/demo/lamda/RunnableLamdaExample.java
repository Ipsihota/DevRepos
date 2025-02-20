package com.practice.demo.lamda;

public class RunnableLamdaExample {
    public static void main(String[] args) {
        //Before Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java8!!Inside run");
            }
        };

//        new Thread(runnable).start();

        // Java 8 using Lamda

        new Thread(()-> System.out.println("Java8!!Inside run")).start();

    }
}
