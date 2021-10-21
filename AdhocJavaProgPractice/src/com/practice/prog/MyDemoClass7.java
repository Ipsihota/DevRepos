package com.practice.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyDemoClass7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(45);
        list.add(3);
        list.add(2);
        list.add(40);

        Integer res = list.stream().filter(x-> x%2==0).reduce(0, (x,y)->x+y);
//        Integer res = list.stream().filter(x-> x%2==0).reduce(0, Integer::sum);
        System.out.println(res);
    }
}
