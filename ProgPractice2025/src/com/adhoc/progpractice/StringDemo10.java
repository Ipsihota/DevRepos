package com.adhoc.progpractice;

public class StringDemo10 {
    public static void main(String[] args) {
        String s1 = "Learning java. we have lots of openings in java";

//        System.out.println(s1.substring(s1.indexOf("java"), s1.length()));
        System.out.println("String Count: " + recStringCount(s1, "java"));

    }

    public static int recStringCount(String s, String sub) {
        int cnt = 0;
        if(s.contains(sub)){
            cnt =  1 + recStringCount(s.replace(sub, ""), sub);
        }
        return cnt;
    }
}
