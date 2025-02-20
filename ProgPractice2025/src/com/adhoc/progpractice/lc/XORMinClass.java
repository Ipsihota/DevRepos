package com.adhoc.progpractice.lc;

public class XORMinClass {
    public static void main(String[] args) {
        int num1 = 12, num2 = 1;
        System.out.print("Minimal integer: " + minimizeXor(num1, num2) );
    }

    private static int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1);
        int b = Integer.bitCount(num2);
        int res = num1;

        for (int i = 0; i < 32; i++) {
            if (a > b && ((1 << i) & num1) > 0) {
                res ^= 1 << i;
                a--;
            }
            if (a < b && ((1 << i) & num1) == 0) {
                res ^= 1 << i;
                a++;
            }
        }

        //learning
//        System.out.print("check1: " + a + ", " + b);
//
//        System.out.println();
//        System.out.print( (1 << 1) & num1);
//        System.out.println();

        return res;
    }
}
