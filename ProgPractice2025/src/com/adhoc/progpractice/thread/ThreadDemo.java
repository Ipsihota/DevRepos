package com.adhoc.progpractice.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTestClass t1 = new ThreadTestClass();
        ThreadTestClass t2 = new ThreadTestClass();

        t1.start();
        t2.start();
    }
}
