package com.adhoc.progpractice;

public class SimpleFactorial {
    public static void main(String[] args) {
        int number = 5;
        int fact = number;

        for (int i = number-1; i > 1; i--) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
