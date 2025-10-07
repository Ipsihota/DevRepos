package com.tuf.prog.mustdo;

/* 1
   12
   123
   1234
   12345
 */

public class Pattern3 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a++);
            }
            a = 1;
            System.out.println();
        }
    }
}
