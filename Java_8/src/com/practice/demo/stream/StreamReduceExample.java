package com.practice.demo.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,9);
        // stream 1, 3, 5, 9
        //flow -> identity = 1, x=1, y = 1(from stream) then result -> 1*1 = 1
        // x = 1(result of prv.), y = 3 then result -> 1*3 = 3
        // x = 3, y = 5 then result -> 3*5 = 15
        // x = 15, y = 9 then result -> 15*9 = 135 final output
        System.out.println(intList.stream()
                .reduce(1,(x,y) -> x*y));

        System.out.println(intList.stream().reduce(0, (x,y) -> x*y));
    }
}
