package com.adhoc.progpractice.tuf;

public class BinarySubArrCount {
    public static void main(String[] args) {
        int []a = {1, 0, 1, 0, 1};
        int k = 2;

        System.out.println("Count of binary sub array: " + findBinarySumArrayCount(a, k));
    }

    private static int findBinarySumArrayCount(int[] a, int k) {
        return subArrayHelperCount(a, k) - subArrayHelperCount(a, k-1);
    }

    private static int subArrayHelperCount(int[] a, int k) {
        int sum = 0, l = 0, count = 0;

        for (int r = 0; r < a.length; r++) {
            sum = sum + a[r];

            while (sum > k && l<r) {
                sum = sum - a[l++];
            }
            count = count + r - l +1;
        }
        return  count;
    }
}
