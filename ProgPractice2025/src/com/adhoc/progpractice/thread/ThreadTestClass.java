package com.adhoc.progpractice.thread;

public class ThreadTestClass extends Thread{

    public void start() {
       System.out.println("In side start method!");
    }

    public void run() {
        System.out.println("Thread Execution started here!");
    }
}
