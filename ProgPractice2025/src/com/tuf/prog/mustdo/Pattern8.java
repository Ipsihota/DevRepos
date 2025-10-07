package com.tuf.prog.mustdo;

/*
 *******
  *****
   ***
    *
 */

public class Pattern8 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = n - i - 1; j > 0 ; j--) {
                // for printing spaces!
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                // for printing odd numbers of stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
