package com.adhoc.progpractice;

public class RevString_Recursion {
    public static void main(String[] args) {
        String s = "Java";
        getReverseString(s);

}
    protected static void getReverseString(String s) {
        if(s.length()<=0){
            return;
        } else {
            System.out.print(s.charAt(s.length()-1));
            getReverseString(s.substring(0,s.length()-1));
        }
    }
}
