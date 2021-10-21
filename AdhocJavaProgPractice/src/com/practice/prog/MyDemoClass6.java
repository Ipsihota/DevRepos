package com.practice.prog;

import java.util.Arrays;

public class MyDemoClass6 {
    public static void main(String[] args) {
        int a[] = {1,3,45,7,9,33,47};

        // filter >10
        Arrays.stream(a).filter(x-> x>10).forEach(x-> System.out.println(x));
        // sort desc ->
        Arrays.stream(a).filter(x-> x>10);


    }
}
