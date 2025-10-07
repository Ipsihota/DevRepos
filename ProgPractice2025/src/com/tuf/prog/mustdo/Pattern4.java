package com.tuf.prog.mustdo;

/* 1
   22
   333
   4444
   55555
 */

public class Pattern4 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            a = a + 1;
            System.out.println();
        }
    }
}
