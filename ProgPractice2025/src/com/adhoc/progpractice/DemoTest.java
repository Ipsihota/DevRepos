package com.adhoc.progpractice;

public class DemoTest {
    public static void main(String[] args) {
        int num = -3;
        int k = 5;
        int remainder = (num % k + k) % k;

        System.out.println(remainder);
    }
}
