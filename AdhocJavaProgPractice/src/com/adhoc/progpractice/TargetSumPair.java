package com.adhoc.progpractice;

import java.util.HashSet;
import java.util.Set;

public class TargetSumPair {
    public static void main(String[] args) {
        int arr[] = {12, 5, 8, 20};
        int target = 15;
        
        boolean isPairExist= getPairInfo(arr, target);
        System.out.println(isPairExist);
    }

    protected static boolean getPairInfo(int[] arr, int target) {
        Set<Integer> setElem = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            setElem.add(arr[i]);
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(setElem.contains(target- arr[i])){
                System.out.print("("+arr[i] + "," + (target- arr[i])+")");
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
