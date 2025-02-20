package com.adhoc.progpractice.lc;

import java.util.ArrayList;
import java.util.List;

public class WordSubSetClass {
    public static void main(String[] args) {
        String []words1 = {"amazon","apple","facebook","google","leetcode"};
        String []words2 = {"lo","eo"};
        System.out.println(wordSubsets(words1, words2));
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26]; // To store the maximum frequency of each char required from words2

        // Calculate max frequencies from words2
        for (String word : words2) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], wordFreq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        // Check universal string
        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> wordSubSets1(String[] words1, String[] words2) {

        List<String> stringList = new ArrayList<>();

        for(int i = 0; i<= words1.length-1; i++) {
            int count = 0;
            for(int j = 0; j<= words2.length-1; j++) {
                if(words1[i].contains(words2[j])){
                    count = count + 1;
                }
            }
            if(count == words2.length){
                stringList.add(words1[i]);
            }
        }
        return stringList;
    }
}