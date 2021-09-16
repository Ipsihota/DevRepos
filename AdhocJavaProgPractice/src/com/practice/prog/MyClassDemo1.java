package com.practice.prog;

public class MyClassDemo1 {
    public static void main(String[] args) {
        int []a = {5, 8, 22, 99, 100, 66, 22, 10, 3};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];
            }
            if(a[i]<max){
                break;
            }
        }

        System.out.println(max);
    }
}
