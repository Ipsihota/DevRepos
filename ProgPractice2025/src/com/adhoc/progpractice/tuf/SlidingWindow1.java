package com.adhoc.progpractice.tuf;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow1 {
    public static void main(String[] args) {
        String str = "abcaabcdbb";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }

    private static int solve(String str) {
        int r = 0;
        int l = 0;
        int n = str.length();
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < n) {
            if (map.containsKey(str.charAt(r))) {
                l = Math.max(map.get(str.charAt(r)) + 1, l);
            }
            map.put(str.charAt(r), r);
            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }
}
