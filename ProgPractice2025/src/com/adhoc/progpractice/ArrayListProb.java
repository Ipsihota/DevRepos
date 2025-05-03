package com.adhoc.progpractice;

import java.util.Stack;

public class ArrayListProb {
    // Find the next greater element of each element in the array
    public static void main(String[] args) {
        int a[] = {6, 8, 1, 4, 3};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length ; i++) {
            stack.push(a[i]);

        }
    }
    public static void main1(String[] args) {
        int a[] = {6, 8, 1, 4, 3};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            flag = false;
            for (int j = i+1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    System.out.println(a[i] + "->" + a[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
               System.out.println(a[i] + "->-1");
            }
        }
    }
}
