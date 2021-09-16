package com.adhoc.progpractice;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "abc";
        permutation(s1, "");
    }

    protected static void permutation(String s1, String res) {
        if(s1 == null || s1.length()== 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            String restString = s1.substring(0, i) + s1.substring(i+1);
            permutation(restString, res+ch);
        }

    }
}
