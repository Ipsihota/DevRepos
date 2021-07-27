package com.practice.demo.parallelStream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;

public class ParallelStreamExample2 {

    public static long getPerformanceForSequential(){
        long startTime = System.currentTimeMillis();
        StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        long endTime =System.currentTimeMillis();
        return endTime-startTime;
    }

    public static long getPerformanceForParallel(){
        long startTime = System.currentTimeMillis();
        StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        long endTime =System.currentTimeMillis();
        return endTime-startTime;
    }
    public static void main(String[] args) {
        System.out.println("getPerformanceForSequential: "+ getPerformanceForSequential());
        System.out.println("getPerformanceForParallel: "+ getPerformanceForParallel());
    }
}
