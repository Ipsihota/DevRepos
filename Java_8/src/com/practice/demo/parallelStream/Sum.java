package com.practice.demo.parallelStream;

public class Sum {
    private static int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static int perfomSum(int input){
        total+=input;
        return total;
    }
}
