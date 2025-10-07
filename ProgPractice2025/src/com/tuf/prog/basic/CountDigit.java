package com.tuf.prog.basic;

public class CountDigit {
    public static void main(String[] args) {
        int num = 121973;
        System.out.println("Count is : " + findCount(num));
    }

    protected static int findCount(int num){
        int count = (int)Math.log10(num) + 1 ;

        return count;
    }

    protected static int findCount1(int num){
        int count = 0;
        while (num > 0) {
            num = num/10;
            count = count + 1;
        }
        return count;
    }
}
