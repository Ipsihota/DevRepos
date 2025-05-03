package com.adhoc.progpractice.tuf;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1};
        int k = 3;
        System.out.println("Count of max consecutive 1's with k 0's: " + findConsecutiveOnes(arr, k));
    }

    private static int findConsecutiveOnes(int[] arr, int k) {
        int maxLen = 0;

        int l = 0;
        int zPos = 0;

        for (int r = 0; r < arr.length; r++) {

            if (arr[r] == 0 ) {
                zPos++;
            }

            while (zPos > k)
            {
                if(arr[l] == 0) {
                    zPos--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);

        }

        return maxLen;
    }
}
