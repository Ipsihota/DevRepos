package com.adhoc.progpractice.lc;

import java.util.Arrays;

public class LongestSeqCount {
    public static void main(String[] args) {
        int []a = {1, 200, 100, 3, 4, 6, 5, 2 };

        int lcsCnt = findLCSCount(a);
        System.out.println("Longest Sequence Count: " + lcsCnt);

    }

    private static int findLCSCount(int[] a) {
        Arrays.sort(a);

        if(a.length == 0) {
            return 0;
        }
        int cnt = 0; int maxCnt = 0;

        for (int i = 1; i < a.length; i++) {
            if(a[i] == a[i-1]+1) {
                cnt = cnt + 1;
            } else {
                cnt = 1;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt + 1;
    }
}
