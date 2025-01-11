package com.adhoc.progpractice.java8;

public class FunctionalInterFaceDemo {
    public static void main1(String[] args) {
        new Thread(() -> System.out.println("Thread created!")).start();
    }

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Thread created via Runnable!");
            }
        }).start();
    }

    public static void main2(String[] args) {
        int a = 5;

        Square s = (int x) -> a*a;

        System.out.println(s.calulateArea(a));
    }
}
