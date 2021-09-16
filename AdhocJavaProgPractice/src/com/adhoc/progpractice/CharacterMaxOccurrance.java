package com.adhoc.progpractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterMaxOccurrance {
    public static void main(String[] args) {
        String s1 = "iiipsitai";
        int maxCount = getMaxOccuranceOfChar(s1);
        System.out.println("CharacterMaxOccurrance: " + maxCount);
    }

    public static int getMaxOccuranceOfChar(String s1) {
        int result = -1;  // Initialize max count

        char ch1 = ' ';   // Initialize result -> for my reference

        // characters and initialize the array as 0
        int count[] = new int[256];
        // Construct character count array from the input
        // string.
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        // Traversing through the string and maintaining
        // the count of each character

        for (int i = 0; i < s1.length(); i++) {
            if (result < count[s1.charAt(i)]) {
                result = count[s1.charAt(i)];
                ch1 = s1.charAt(i);
            }
        }
        System.out.println("my reference : " + ch1);

//        char []ch = s1.toCharArray();
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < ch.length; i++) {
//            if(!map.containsKey(ch[i]))
//                map.put(ch[i], 1);
//            else
//                map.put(ch[i], map.get(ch[i])+1);
//        }

        return result;
    }
}
