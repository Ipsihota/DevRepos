package com.adhoc.progpractice.tuf;

public class CountDigit {

    public static void main(String[] args) {
        int a = 567391234;

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        int cnt = (int)Math.log10(a) +1;

        System.out.println("Count of digit: "+ cnt);

    }

    public static void main2(String[] args) {
        int a = 12345;
        int count = 0;
        while (a > 0) {  // Complexity - depends on the digit, log10N + 1
            a = a/10;
            count = count + 1;
        }
        System.out.println("Count of digit: "+ count);

    }
    public static void main1(String[] args) {
        int a = 12345;

        char[] ch = String.valueOf(a).toCharArray();
        int cnt = 0;
        for (char c : ch) {  // Complexity - O(n)
            if (Character.isDigit(c)){
                cnt = cnt + 1;
            }
        }

        System.out.println("Count of digit: "+ cnt);
    }
}
