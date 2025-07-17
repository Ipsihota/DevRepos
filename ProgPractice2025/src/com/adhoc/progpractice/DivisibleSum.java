package com.adhoc.progpractice;

import java.util.*;

public class DivisibleSum {
    /**
     * Finds pairs of numbers from the input list `nums` such that their sum
     * is divisible by `target`. Numbers are grouped by their remainders when
     * divided by `target`.
     *
     * - If two numbers have remainders `i` and `(target - i) % target`, they can form a pair.
     * - Special case: if `i == (target - i) % target` (e.g., remainder 0 when target is even,
     * or remainder target/2 when target is even), numbers with this remainder can pair with
     * each other.
     *
     * @param nums The input list of integers.
     * @param target The divisor for checking sum divisibility.
     * @return A list of lists, where each inner list contains a pair of integers.
     */
    public static List<List<Integer>> find(List<Integer> nums, int target) {
        int n = nums.size();
        // Using HashMap to store numbers grouped by their remainder.
        // Key: remainder, Value: List of numbers having that remainder.
        Map<Integer, List<Integer>> map = new HashMap<>();

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Fill map with remainders
        // Ensure remainders are always non-negative.
        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            int rem = (val % target + target) % target; // Ensure positive remainder for negative numbers
            map.putIfAbsent(rem, new ArrayList<>());
            map.get(rem).add(val);
        }

        // Step 2: Form valid pairs
        // Iterate through possible remainders from 0 to target/2.
        // This avoids duplicate checks (e.g., checking (1, target-1) and then (target-1, 1)).
        for (int i = 0; i <= target / 2; i++) {
            // Calculate the complementary remainder.
            // If i is 0, rem will be 0. If i is x, rem will be target - x.
            int rem = (target - i) % target;

            if (i == rem) {
                // Case 1: Remainder pairs with itself (e.g., 0 with 0, or target/2 with target/2)
                // Get the list of numbers having this remainder. Use Collections.emptyList() for safety
                // if the remainder is not present, to avoid NullPointerException.
                List<Integer> vec = map.getOrDefault(rem, new ArrayList<>()); // Use new ArrayList to allow adding elements if needed, or if map.get is null.

                // Form pairs by taking two numbers at a time from this list.
                // Example: for numbers [5, 10, 15] with target=5, remainder is 0.
                // We form (5, 10), then (15, ... wait for next 0).
                for (int j = 0; j + 1 < vec.size(); j += 2) {
                    ans.add(Arrays.asList(vec.get(j), vec.get(j + 1)));
                }
            } else {
                // Case 2: Two different remainders pair up (e.g., remainder `i` with `rem`)
                List<Integer> vec1 = map.getOrDefault(i, new ArrayList<>());
                List<Integer> vec2 = map.getOrDefault(rem, new ArrayList<>());

                // Form pairs by taking one from vec1 and one from vec2.
                // The number of pairs is limited by the smaller of the two lists.
                int range = Math.min(vec1.size(), vec2.size());

                for (int j = 0; j < range; j++) {
                    ans.add(Arrays.asList(vec1.get(j), vec2.get(j)));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example from your C++ main:
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int target1 = 2;
        List<List<Integer>> result1 = find(nums1, target1);
        System.out.println("Result for nums=" + nums1 + ", target=" + target1 + ":");
        for (List<Integer> pair : result1) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
        // Expected for (1,2,3,4,5,6), target=5:
        // 1 4 (sum 5)
        // 2 3 (sum 5)
        // 5 (remainder 0) needs another 5 (no other 5 to pair) - not included unless multiple 5s
        // 6 (remainder 1) needs 4 (1 and 4 already used), 6 pairs with 4
        // The original C++ output for this example with the "all combinations" logic would be different.
        // Based on the given Java logic, for (1,2,3,4,5,6) and target=5, the output would be:
        // 1 4
        // 2 3
        // 6 (no other 4, nor 1, available as 1 and 4 are matched already).
        // If there were two 5s, they would pair.

       /* System.out.println("\n--- Additional Test Cases ---");

        // Test Case 1: Multiple numbers with the same remainder that can pair with themselves
        List<Integer> nums2 = Arrays.asList(5, 10, 15, 20);
        int target2 = 5; // All have remainder 0
        List<List<Integer>> result2 = find(nums2, target2);
        System.out.println("Result for nums=" + nums2 + ", target=" + target2 + ":");
        for (List<Integer> pair : result2) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
        // Expected: (5, 10), (15, 20)

        // Test Case 2: Mixed remainders
        List<Integer> nums3 = Arrays.asList(1, 2, 3, 7, 8, 9);
        int target3 = 10;
        List<List<Integer>> result3 = find(nums3, target3);
        System.out.println("Result for nums=" + nums3 + ", target=" + target3 + ":");
        for (List<Integer> pair : result3) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
        // Expected: (1,9), (2,8), (3,7)

        // Test Case 3: Negative numbers
        List<Integer> nums4 = Arrays.asList(-1, -2, 11, 12);
        int target4 = 10;
        List<List<Integer>> result4 = find(nums4, target4);
        System.out.println("Result for nums=" + nums4 + ", target=" + target4 + ":");
        for (List<Integer> pair : result4) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
        // Expected: (-1, 11) -> (-1%10=9, 11%10=1) -> 9+1=10
        // (-2, 12) -> (-2%10=8, 12%10=2) -> 8+2=10

        */
    }
}
