package com.practice.demo.lamda;

import java.util.function.Consumer;

public class LamdaVariableExample1 {
    public static void main(String[] args) {
        int i = 0;
//        Consumer<Integer> c1 = i -> System.out.println(i); Not possible as already we have same local variable.
        Consumer<Integer> c1 = i1 -> System.out.println(i);
    }
}
