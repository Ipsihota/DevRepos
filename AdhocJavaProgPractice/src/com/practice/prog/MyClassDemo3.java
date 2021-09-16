package com.practice.prog;

public class MyClassDemo3 {
    public static void main(String[] args) {
        int []a = {1,0,0,3,0};
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len-1; i++) {
            if(a[i] != 0){
                a[count] = a[i];
               count++;
            }
        }
        for (int i = count; i < len-1; i++) {
            a[i] = 0;
        }

        for (int x: a
             ) {
            System.out.print(x);

        }

    }
}
