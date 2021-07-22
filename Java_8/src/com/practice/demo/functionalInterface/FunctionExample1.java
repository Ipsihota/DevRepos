package com.practice.demo.functionalInterface;

import java.util.function.Function;

public class FunctionExample1 {
    static Function<String, String> func1 = name -> name.toUpperCase();
    static Function<String, String> func2 = name -> name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("func1 : " + func1.apply("java8"));
        System.out.println("func2 andThen : "+ func1.andThen(func2).apply("java8"));
        System.out.println("func2 compose : "+ func1.compose(func2).apply("java8"));
    }
}
