package com.adhoc.progpractice;

public class FrequencyArrDemo {
    public static void main(String[] args) {
        int []a = {1,3,2,4};
        int []b = {3,1,2,4};
        int [] ans = findThePrefixCommonArray(a, b); // o/p - [0,2,3,4]
        for(int elem: ans){
            System.out.print(elem + " ");
        }
    }

    private static int[] findThePrefixCommonArray(int[] a, int[] b) {

        boolean []seen = new boolean[51];
        int lenght = a.length;
        int []ans = new int[lenght];
        int common = 0;

        for (int i = 0; i < lenght; i++) {
            if(seen[a[i]]) {
                common = common + 1;
            } else {
                seen[a[i]] = true;
            }

            if(seen[b[i]]) {
               common = common + 1;
            } else {
                seen[b[i]] = true;
            }
            ans[i] = common;
        }
return ans;
    }
}
