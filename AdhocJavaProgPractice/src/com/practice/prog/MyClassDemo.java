package com.practice.prog;

public class MyClassDemo {
    public static void main1(String[] args) {
        String s= "Java";
        int index = -2;

        if(index>= 0 &&index<=s.length()-1)
           System.out.println(s.charAt(index));
        else
            System.out.println("Please enter correct index!");
    }

    public static void main(String[] args) {
        String s= "abc";

//        getRevStr(s);
        getPermutation(s, "");
    }

    private static void getPermutation(String s, String val) {
        if(s == null || s.length() == 0 ){
            System.out.println(val);
            return;
        }
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String ros = s.substring(0, i) + s.substring(i+1);

            getPermutation(ros, val+ch);

        }
    }

    private static void getRevStr(String s) {
        if (s==null || s.length()<=1){
            System.out.println(s);
        } else {
            System.out.print(s.charAt(s.length() - 1));
//        if(len>= 0 &&len<=s.length()-1)
//        System.out.println(s.substring(0,s.length()-1));
            getRevStr(s.substring(0, s.length() - 1));
        }

    }
}
