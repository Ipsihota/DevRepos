package com.tuf.prog.basic;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed: " + reverseNumber(num));
    }

    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int rem = num%10;
            reversed = (reversed * 10) + rem;
            num = num/10;
        }
        return reversed;
    }
}
