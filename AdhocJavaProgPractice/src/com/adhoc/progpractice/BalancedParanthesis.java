package com.adhoc.progpractice;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input = "{[]}([)]";
        boolean isBalanced = getBalancedStructFlag(input);
        System.out.println("Result: " + isBalanced);
    }

    protected static boolean getBalancedStructFlag(String input) {
        boolean flag = false;
        Stack<Character> item = new Stack<>();
//        char []ch = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='['){
                item.push(input.charAt(i));
            }else if(!item.empty() && ((input.charAt(i) == ']' && item.peek() == '[')
                    || (input.charAt(i) == '}' && item.peek() == '{')
                    ||(input.charAt(i) == ')' && item.peek() == '('))){
                item.pop();
            } else {
                item.push(input.charAt(i));
            }
        }
        if(item.empty())
            flag = true;

        return flag;
    }
}
