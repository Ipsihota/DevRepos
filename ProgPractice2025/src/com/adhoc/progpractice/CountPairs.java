package com.adhoc.progpractice;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static int countPairs(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        Map<Integer, Integer> remainders = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int remainder = arr[i] % k;
            int complement = (k - remainder) % k; // Important: Handles remainder 0 correctly

            if (remainders.containsKey(complement)) {
                count += remainders.get(complement);
            }
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int result = countPairs(arr, k);
        System.out.println("Number of pairs whose sum is a multiple of " + k + ": " + result);
    }
}
