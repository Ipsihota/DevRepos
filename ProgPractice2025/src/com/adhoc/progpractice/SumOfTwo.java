package com.adhoc.progpractice;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static void main(String[] args) {
        int []a = {2, 7, 11, 15, -6};
        int target = 9;

        findSumOf2(a, target);

    }

    private static void findSumOf2(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(target-a[i])) {
                System.out.println("Pair:" + a[i] + ", " + a[map.get(target-a[i])]);
            } else {
                map.put(a[i], i);
            }
        }
    }
}
