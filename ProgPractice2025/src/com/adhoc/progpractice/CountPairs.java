package com.adhoc.progpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayDemo1 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : " );
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter array element of size : " + size);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        } */

        // to find the count, which sum is multiple to the given number.
        int arr[] = {5, 10, 9, 30, 1};  int target = 10;
        Map<Integer, Integer> reminderMap = new HashMap<>();
        int count = 0;
        reminderMap.put(0, 1);

        for (int num : arr){
            int rem = num
        }

        System.out.println("Count: " + count);
    }
}
