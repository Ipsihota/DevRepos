package com.practice.demo.lamda;

import java.util.function.Consumer;

public class LamdaVariableExample2 {
    static int val = 4;
    public static void main(String[] args) {
//        int val = 4;
        Consumer<Integer> c1 = integer -> {
//            val++; should be effectively final, in case of local instance
            val++;// in case of class variable this can be doable.
            System.out.println(val+integer);
        };
        c1.accept(4);
    }
}
