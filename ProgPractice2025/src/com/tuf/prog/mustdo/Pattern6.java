package com.tuf.prog.mustdo;

/*
   12345
   1234
   123
   12
   1
 */

public class Pattern6 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a++);
            }
            a = 1;
            System.out.println();
        }
    }
}
