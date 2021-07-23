package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //sort by name student data base
        List<Student> sortedName = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted Student By Name:");
        sortedName.forEach(System.out::println);


        List<Student> sortedGpa = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()) // reverse will help to print in DESC order!
                .collect(Collectors.toList());
        System.out.println("Sorted Student By GPA:");
        sortedGpa.forEach(System.out::println);
    }
}
