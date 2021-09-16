package com.adhoc.progpractice;

public class RevString {
    public static void main(String[] args) {
        String s = "Java is a language";

        String revStr = getReverseString(s);
        System.out.println(revStr);

    }

    private static String getReverseString(String s) {
        String revStr = "";

        //Logic
        char []ch = s.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
//        }

        for (int i = ch.length-1; i >= 0; i--) {
           revStr+=ch[i];
        }
        return revStr;
    }
}
