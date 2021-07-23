package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationExample {
    public static void main(String[] args) {
        List<String> distinctActivities =
                StudentDataBase.getAllStudents().stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctActivities: " + distinctActivities);

        List<String> distinctSortedActivities =
                StudentDataBase.getAllStudents().stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println("distinctSortedActivities: " + distinctSortedActivities);

        Long noOfActivities =
                StudentDataBase.getAllStudents().stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                        .count();
        System.out.println("noOfActivities: " + noOfActivities);
    }
}
