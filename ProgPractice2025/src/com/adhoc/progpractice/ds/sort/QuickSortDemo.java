package com.adhoc.progpractice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});

        int n = arr.size();
        // post sorting

        quickSort(arr, 0, n-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    protected static void quickSort(List<Integer> arr, int low, int high) {

        if(low < high) {
            // get the index of pivot
            int pIndex = partition(arr, low, high);

            quickSort(arr, low, pIndex-1); // left sub array

            quickSort(arr, pIndex +1, high); // right sub array
        }
    }

    protected static int partition(List<Integer> arr, int low, int high) {

        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
