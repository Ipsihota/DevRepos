package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    //It will take 2 input and provide 1 output, so here will take input as studentList and predicate of student
//    output will be Student map<String, Double>, will print name and GPA based on predicate.
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (studentList, studentPredicate) -> {
        Map<String, Double> map = new HashMap<>();
              studentList.forEach(
                      student -> {
                          if(studentPredicate.test(student)){
                              map.put(student.getName(),student.getGpa());
                          }
                      }
              );
              return map;
            };
    public static void main(String[] args) {
        System.out.println("Student list : " + biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p1) );
    }
}
