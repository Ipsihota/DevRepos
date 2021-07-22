package com.practice.demo.lamda;

import java.util.Comparator;

public class ComparatorLamdaExample {
    public static void main(String[] args) {
        //Before Java8
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result before Java8: "+ integerComparator.compare(4, 3));

        // Java8 using Lamda
        Comparator<Integer> integerComparator1 = (a,b)->a.compareTo(b);
        System.out.println("Result Java8: "+ integerComparator1.compare(4, 3));
    }
}
