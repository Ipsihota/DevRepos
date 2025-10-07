package com.tuf.prog.basic;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i <= 9; i++) {
            if (num != i && num % i == 0) {
               isPrime = false;
            }
        }
        System.out.println("Is Prime: " + isPrime);

    }
}
