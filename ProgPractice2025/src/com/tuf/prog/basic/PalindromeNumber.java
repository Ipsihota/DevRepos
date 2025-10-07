package com.tuf.prog.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNum(121));
    }

    private static String isPalindromeNum(int num) {
        int rNum = 0;
        int tempNum = num;
        while (num > 0) {
            int rem = num % 10;
            rNum = (rNum * 10) + rem;
            num = num/10;
        }

        if (tempNum == rNum) {
            return " A Palindrome number!";
        } else {
            return " Not a palindrome number!";
        }
    }
}
