package com.adhoc.progpractice.tuf;

public class BalanceParanthesesDemo {
    public static void main(String[] args) {
        String s = "())()))";
        int countO = 0, conuntC = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') countO ++;
            else {
                if(countO == 0)
                    conuntC++;
                else
                    countO--;
            }
        }
        System.out.println(countO + conuntC);
    }
}
