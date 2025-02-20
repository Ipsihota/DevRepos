package com.adhoc.progpractice.lc;

public class BalancedParanthesesCheck {
    public static void main(String[] args) {
        String s = "))(())";
        String locked = "010100";
        System.out.println("IsBalanced: " + isBalanced(s, locked));
    }

    protected static boolean isBalanced(String s, String locked) {
        if(s.length() != locked.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
//            if(i == 0 )
        }
        return false;
    }
}
