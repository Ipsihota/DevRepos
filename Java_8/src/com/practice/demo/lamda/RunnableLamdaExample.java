package com.practice.demo.lamda;

public class RunnableLamdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java8!!Inside run");
            }
        };

        new Thread(runnable).start();
    }
}
