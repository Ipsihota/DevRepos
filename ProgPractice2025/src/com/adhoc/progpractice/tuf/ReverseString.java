package com.adhoc.progpractice.tuf;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Just believe in God!";
        System.out.println("Reverse Result: " + reverseString(str));
    }

    private static String reverseString(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >=0; i--) {
           sb.append(strArr[i] + " ");
        }
        return sb.toString();
    }
}
