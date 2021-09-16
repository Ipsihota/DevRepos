package com.adhoc.progpractice;

public class MyClass1 {
    public static void main(String[] args) {
        int target = 10;
        int []a = {8,7,2,5,3,1};

        boolean result = getPair(a, target);
        System.out.println(result);
    }

    private static boolean getPair(int[] a, int target) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for(int j =i+1; j< a.length; j++) {
                if (a[i] + a[j] == target) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
