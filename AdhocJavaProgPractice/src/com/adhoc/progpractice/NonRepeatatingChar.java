package com.adhoc.progpractice;

public class NonRepeatatingChar {
    public static void main(String[] args) {
        String s2 = "aabbf";

        String nonRepeatingChar = getNonRepeatingElem(s2);
        System.out.println(nonRepeatingChar);

//        int []arr = {1, 2, 30 ,2, 1, 40}; // 3
//
//        int nonRepeatingElem = getNonRepeatingElem(arr);
//        System.out.println(nonRepeatingElem);
    }

    private static int getNonRepeatingElem(int[] arr) {
        int []cnt = new int[Integer.MAX_VALUE];

        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(cnt[i] == 1){
                return arr[i];
            }
        }
        return 0;
    }

    protected static String  getNonRepeatingElem(String a) {
        final int NO_OF_CHAR = 256;
        char []count = new char[NO_OF_CHAR];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
        }

        for (int i = 0; i < a.length(); i++) {
            if(count[a.charAt(i)] == 1){
                return a.charAt(i)+"";
            }
        }

        return "";
    }
}
