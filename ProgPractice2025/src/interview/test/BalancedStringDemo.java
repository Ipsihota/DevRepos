package interview.test;

import java.util.Stack;

public class BalancedStringDemo {
    public static void main(String[] args) {
        String str = "{[()]}";
        boolean isBalanced = isBalancedStr(str);
        System.out.println(isBalanced);
    }

    private static boolean isBalancedStr(String str) {

        Stack<Character> stack = new Stack<>();

        char [] charry = str.toCharArray();

        for (int i = 0; i < charry.length; i++) {
            if(charry[i] == '[' || charry[i] == '(' || charry[i] == '{') {
                stack.push(charry[i]);
            }
             else {
                 if(stack.empty()) return false;
                 if ((stack.peek() == '[' && charry[i] == ']')
                        || (stack.peek() == '(' && charry[i] == ')')
                        || (stack.peek() == '{' && charry[i] == '}')) {
                    stack.pop();
            }
            }
        }

        return stack.empty();

    }
}
