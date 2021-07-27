package com.practice.demo.parallelStream;

import javax.sound.midi.Soundbank;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample1 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("sequential stream sum: " + getSequentialStreamSum());
        System.out.println("parallel stream sum: " +getParallelStreamSum());
        System.out.println("Performance of sequential stream : " + checkPerformanceResult(ParallelStreamExample1::getSequentialStreamSum, 20));
        System.out.println("Performance of parallel stream : " + checkPerformanceResult(ParallelStreamExample1::getParallelStreamSum, 20));
    }

    private static long checkPerformanceResult(Supplier<Integer> getSequentialStreamSum, int n) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<=n; i++){
            getSequentialStreamSum.get();
        }
        long endTime =System.currentTimeMillis();
        return endTime-startTime;
    }

    private static int getSequentialStreamSum() {
//It will use only one processor!!!
        int seqSum = IntStream.rangeClosed(1, 100000).sum();
        return seqSum;
    }

    private static int getParallelStreamSum() {
        //It will use multiple processor by spliting values!!!
        int parallelSum = IntStream.rangeClosed(1, 100000).parallel().sum();
        return parallelSum;
    }
}
