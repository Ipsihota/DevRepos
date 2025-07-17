package com.adhoc.progpractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : " );
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter array element of size : " + size);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        } */

        // to find pair, which sum is equal to given number.
        int arr[] = {5, 10, 9, 30, 1};  int target = 10;
        int []index = new int[2];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])) {
                count = count + 1;

                index[1] = i;
                index[0] = map.get(target-arr[i]);
                System.out.println("Indexes: " + index[0] + ", " + index[1]);
            }
            map.put(arr[i], i);
        }
        System.out.println("Count: " + count);
    }
}
