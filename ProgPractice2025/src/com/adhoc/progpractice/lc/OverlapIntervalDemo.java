package com.adhoc.progpractice.lc;

import java.util.Arrays;

public class OverlapIntervalDemo {

    public static void main(String[] args) {
        int intervals[][] = { { 1, 2 }, { 3, 4 }, { 2, 3 }, { 1, 3 } };
        int maxAttended = eraseOverlapMeetings(intervals);
        System.out.println("Interval length: "+ intervals.length);
        System.out.println("maxAttended: "+ maxAttended);

//        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        // Printing the Array
//        for (int i = 0; i < intervals.length; i++){
//            for (int j = 0; j < 2; j++) {
//                System.out.print(intervals[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static int eraseOverlapMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int prev = 0;

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count = count + 1;
            }
        }
        return count;
    }

}
