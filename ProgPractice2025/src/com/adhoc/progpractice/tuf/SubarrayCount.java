package com.adhoc.progpractice.tuf;

import java.util.HashMap;
import java.util.Map;

public class SubarrayCount {

    // Count of sub array which sum is equal to k
    public static void main(String[] args) {
        int []arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println("Sub-array count is : " + findSubarryCount(arr, k));
    }

    private static int findSubarryCount(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if(prefixSumMap.containsKey(sum-k)){
              count = count + prefixSumMap.get(sum - k);
            }

            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
}
