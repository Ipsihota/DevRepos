package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
// Print out value of student with appropriate GPA!!!
    public static void main(String[] args) {

        Function<List<Student>, Map<String, Double>> fun1 = studentList->{
            Map<String, Double> studentMap = new HashMap<>();
            studentList.forEach(student ->
            {
                //If any specific condition required!! In old version
                /*if(student.getGradeLevel()>3){
                    studentMap.put(student.getName(), student.getGpa());
                }*/
                //If any specific condition required!! In Java8 version
                if(PredicateStudentExample.p1.test(student)){
                    studentMap.put(student.getName(), student.getGpa());
                }
            });
            return studentMap;
        };

        System.out.println("Results: " + fun1.apply(StudentDataBase.getAllStudents()));
    }
}
