package com.practice.demo.parallelStream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        //sequential stream result will be 50005000, but in parallel stream this will vary
        // 37500485 50005000 36359579 like that
        IntStream.rangeClosed(1, 10000)
                .parallel()
                .forEach(Sum::perfomSum);
        System.out.println("Result: " + sum.getTotal());
    }
}
