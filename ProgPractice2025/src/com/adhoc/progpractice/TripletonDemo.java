package com.adhoc.progpractice;

public class TripletonDemo {
    public static void main(String[] args) {
        // Demonstrate the cycling behavior in a single-threaded context.
        System.out.println("--- Single-threaded demonstration ---");
        for (int i = 0; i < 10; i++) {
            TripletonClass instance = TripletonClass.getInstance();
            instance.printInstanceInfo();
        }

//        System.out.println("\n--- Multi-threaded demonstration ---");
        // Demonstrate the behavior with multiple threads.
        // We'll create 10 threads, and each will try to get an instance.
//        Runnable task = () -> {
//            TripletonClass instance = TripletonClass.getInstance();
//            instance.printInstanceInfo();
//        };
//
//        for (int i = 0; i < 10; i++) {
//            new Thread(task, "Thread-" + (i + 1)).start();
//        }
    }
}