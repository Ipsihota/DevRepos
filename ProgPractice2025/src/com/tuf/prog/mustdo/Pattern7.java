package com.tuf.prog.mustdo;

/*
    *
   ***
  *****
 *******

 */

public class Pattern7 {
    public static void main1(String[] args) {
        int n = 4;
        int k = 0;
        int n1 = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = n1-1; j >= 0; j--) {
                System.out.print(" ");
            }
            n1 = n1 - 1;
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            k = k + 2;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
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
