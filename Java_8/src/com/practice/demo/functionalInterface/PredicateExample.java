package com.practice.demo.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = i -> i%2==0;
    static Predicate<Integer> p2 = i -> i%5==0;
    public static void main(String[] args) {
        System.out.println("Result of P1: " + p1.test(4));
        System.out.println("Result of P1: " + p1.test(5));
        printPredicateAnd();
        printPredicateOr();
        printPredicateNegate();
    }

    private static void printPredicateAnd() {
        System.out.println("printPredicateAnd: " + p1.and(p2).test(10)); //predicateChaining
        System.out.println("printPredicateAnd: " + p1.and(p2).test(8)); //predicateChaining
    }

    private static void printPredicateOr() {
        System.out.println("printPredicateOr: " + p1.or(p2).test(10)); //predicateChaining
        System.out.println("printPredicateOr: " + p1.or(p2).test(8)); //predicateChaining
    }

    private static void printPredicateNegate() {
        System.out.println("printPredicateNegate: " + p1.or(p2).negate().test(8)); //predicateChaining
    }
}
