package com.adhoc.progpractice;

import java.util.*;

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
//        Scanner sc = new Scanner(System.in);

        // 1. Read array input
//        System.out.print("Enter numbers (space-separated): ");
//        String[] input = sc.nextLine().split(" ");
//        int[] arr = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
//            arr[i] = Integer.parseInt(input[i]);
//        }

        // 2. Read target divisor K
//        System.out.print("Enter target divisor (K): ");
//        int K = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        // 3. Find pairs using HashMap
        Map<Integer, Integer> remainderCount = new HashMap<>();
        int count = 0;
        count = getPairCount(arr, k, remainderCount, count);

        Map<Integer, List<Integer>> remainderMap = new HashMap<>();
        getPair(arr, k, remainderMap);

        // 4. Print the result
        System.out.println("Number of pairs with sum divisible by " + k + ": " + count);
    }

    private static int getPairCount(int[] arr, int k, Map<Integer, Integer> remainderCount, int count) {
        for (int num : arr) {
            // Calculate remainder, handling negative numbers
            int remainder = (num % k + k) % k;

            // Calculate complement remainder
            int complement = (k - remainder) % k;

            // If complement exists in map, add its count to total pairs
            if (remainderCount.containsKey(complement)) {
                count += remainderCount.get(complement);
            }

            // Update the count for current remainder
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }

    private static void getPair(int[] arr, int k, Map<Integer, List<Integer>> remainderMap) {

        for (int num : arr) {
            // Calculate remainder, handling negative numbers
            int remainder = (num % k + k) % k;

            // Calculate complement remainder
            int complement = (k - remainder) % k;

            // If complement exists in map, add its count to total pairs
            if (remainderMap.containsKey(complement)) {
                for (int pairNum : remainderMap.get(complement)) {
                    System.out.println("Pair: " + pairNum + ", " + num);
                }
            }

            // Add num to reminder group in the map
            remainderMap.computeIfAbsent(remainder, val -> new ArrayList<>()).add(num);
        }
    }
}
