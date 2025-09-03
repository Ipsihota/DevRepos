package com.adhoc.progpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TripletonClass {
    // A private static list to hold the three instances.
     private static final List<TripletonClass> instances = new ArrayList<>();
    // An atomic integer to ensure thread-safe cycling through the instances.
    private static final AtomicInteger counter = new AtomicInteger();
    // Private constructor to prevent direct instantiation from outside the class.
    private TripletonClass() {
        System.out.println("New Tripleton instance created.");
    }

    // Static block to initialize the three instances when the class is loaded.
    // This is a thread-safe way to create the initial objects.

    static {
        for (int i = 0; i < 3; i++) {
            instances.add(new TripletonClass());
        }
    }

    /**
     * Public static method to get an instance of the Tripleton class.
     * It increments a counter and returns the instance at the corresponding index.
     * The use of AtomicInteger ensures that the counter update is safe for
     * concurrent access from multiple threads.
     *
     * @return A TripletonClass instance.
     */
    public static TripletonClass getInstance() {
        // The getAndIncrement() method atomically increments the counter and returns
        // the old value. The modulo operator (%) ensures the index stays between 0, 1, and 2.
        int index = counter.getAndIncrement() % 3;
        System.out.println("Print Index: " + index);
        return instances.get(index);
    }

    // A simple method to demonstrate that different instances are returned.
    public void printInstanceInfo() {
        System.out.println("Instance hash code: " + this.hashCode());
    }
}
