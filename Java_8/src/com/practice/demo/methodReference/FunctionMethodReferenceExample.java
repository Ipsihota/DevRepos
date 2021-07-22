package com.practice.demo.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        System.out.println("Function Res: " + f1.apply("java8"));

        Function<String, String> f2 = String::toUpperCase;
        System.out.println("Function With MethodReference Res: " + f2.apply("java8"));
    }
}
