package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        //Print Student Name and activities!!
        Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
        Predicate<Student> p2 = student -> student.getGpa()>=3.9;

        //collect method is helpful to create stream pipeline!!!
        System.out.println("Stream Example" +StudentDataBase.getAllStudents().stream().filter(p1.and(p2)).
                collect(Collectors.toMap(Student::getName, Student::getActivities)));

        // Debugging Stream flow using peek!!!Flow is sequential like 1,2,3 then 1,2,3 .... and so on
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println) // flow1
                .filter(p1).peek(student -> System.out.println("2nd flow student Details: " + student)) // flow2
                .filter(p2).peek(student -> System.out.println("3rd flow student Details: " + student)) //flow3
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

    }
}
