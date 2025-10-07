package com.tuf.prog.basic;

public class GcdDemo {
    public static void main(String[] args) {
        int a = 20, b = 15;

        // formula if a>b; gcd(a%b, b); if one of them is 0 then the other is GCD

        while (a>0 && b>0){
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a==0) {
            System.out.println("GCD is - " + b);
        } else {
            System.out.println("GCD is - " + a);

        }
    }
}
