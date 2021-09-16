package com.adhoc.progpractice;

public class ThirdLagestNum {
    public static void main(String[] args) {
        int []a = {12, 13, 100, 90, 33, 80};

        int res = getThirdLargestNum(a);// 80 o/p
        System.out.println("ThirdLargestNum:" + res);
    }

    private static int getThirdLargestNum(int[] a) {
        int third = 0, second = 0, first = a[1];

        for (int i = 0; i < a.length; i++) {
            if(a[i] > first){
                third = second;
                second = first;
                first = a[i];
            }else if(a[i]>second){
                third = second;
                second = a[i];
            } else if(a[i]>third){
                third = a[i];
            }
        }

        return third;
    }
}
