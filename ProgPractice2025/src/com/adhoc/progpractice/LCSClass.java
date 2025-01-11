package com.adhoc.progpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LCSClass {
    public static void main(String[] args) {
        int a[] = {1, 52, 99, 12, 56, 2, 1, 3, 4,10,5};
        int x = a.length;
        int longest = findLCSLen1(a, x);
        System.out.println("Result- " + longest);
    }

    private static int findLCSLen1(int[] a, int x) {
        Arrays.sort(a);
        int count = 0;
        int result = 0;
        int smallestNum = Integer.MIN_VALUE;

        for (int i = 0; i < x; i++) {

        if(a[i]-1 == smallestNum){
            count = count+1;
            smallestNum = a[i];
        } else if(a[i] != smallestNum) {
            count = 1;
            smallestNum = a[i];
        }

            result = Math.max(result, count);
        }
        return result;
    }

    private static int findLCSLen(int[] a, int x) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < x; i++) {
            s.add(a[i]);
        }
        int longest = 1;
        for (int val : s) {
            // Checking for smaller consecutive number
            if(!s.contains(val-1)) {
                int existVal = val; // consider the value as first value of the sequence
                int cnt = 1; // counter assigned to 1
                // Checking for greater consecutive number
                while (s.contains(existVal+1)) {
                    cnt = cnt + 1; // counter incremented to 1
                    existVal = existVal+1; // exist value also incremented to 1 to check the consecutive value
                }
                longest = Math.max(longest, cnt); // store the max as result
            }
        }
        return longest;
    }
}
