package com.practice.demo.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Unary_BinaryOperatorExample {
    // UnaryOperater input and output type will be same, extend funtion
    static UnaryOperator<String> stringUnaryOperator = s->s.concat("default");
    //BinaryOperator
    static BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
    //minby and maxby accept comparator..
    static Comparator<Integer> comparator1= (x,y)-> x.compareTo(y);
    public static void main(String[] args) {
        System.out.println("Unary: " + stringUnaryOperator.apply("java8"));
        System.out.println("Binary: " + binaryOperator.apply(3,4));
        System.out.println("BinaryMax: " + BinaryOperator.maxBy(comparator1).apply(3,4));
        System.out.println("BinaryMin: " + BinaryOperator.minBy(comparator1).apply(3,4));
    }
}
