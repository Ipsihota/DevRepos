package com.practice.demo.parallelStream;

//Not to use parallel stream!!!

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,100000).boxed().collect(Collectors.toList());

        int sumSeq = getSequentialStreamSum(integerList);
        int sumParallel = getParallelStreamSum(integerList);
    }

    private static int getSequentialStreamSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream().reduce(0, (a,b)->a+b);
        long endTime =System.currentTimeMillis();
        System.out.println("Sequential Duration: " + (endTime-startTime));
        return sum;
    }

    private static int getParallelStreamSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        // Taking more time as unBoxing from Interger->int
        int sum =integerList.stream().parallel().reduce(0, (a,b)->a+b);
        long endTime =System.currentTimeMillis();
        System.out.println("Parallel Duration: " + (endTime-startTime));
        return sum;
    }
}
