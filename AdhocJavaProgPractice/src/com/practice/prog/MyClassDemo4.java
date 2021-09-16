package com.practice.prog;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyClassDemo4 {
    public static void main(String[] args) {
        int []a = {1, 2, 3 ,2, 1, 4}; // 3

        int nonRepeatingChar = getNonRepeatingElem(a);
        System.out.println(nonRepeatingChar);
    }

    private static int getNonRepeatingElem(int[] a) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < a.length-1; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

            for (Map.Entry entry: map.entrySet()
                 ) {

                if(entry.getValue().equals(1)){
                    return (Integer) entry.getKey();
                }

            }

//            for (int j = 0; j < a.length-1; j++) {
//                if(map.get(a[j]) == 1){
//                    return a[j];
//                }
//            }
        return 0;
    }
}
