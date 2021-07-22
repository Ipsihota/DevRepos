package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    //Define condition generically, will lead to reusable!!
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        printStudentGradeUsingCondition();
        printStudentGpaUsingCondition();
        printStudentUsingCondition();
        printNegateStudentUsingCondition();
    }

    public static void printStudentGradeUsingCondition() {
        System.out.println("------printStudentGradeUsingCondition--------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(p1.test(student)) {
                        System.out.println(student);
                    }
                }
        );
    }

    public static void printStudentGpaUsingCondition() {
        System.out.println("------printStudentGpaUsingCondition--------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(p2.test(student)){
                        System.out.println(student);
                 }
                }
        );
    }

    public static void printStudentUsingCondition() {
        System.out.println("------printStudentUsingCondition-Chaining--------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(p1.and(p2).test(student)){
                        System.out.println(student);
                    }
                }
        );
        System.out.println("----------printStudentUsingCondition- OR--------------");
        studentList.forEach(
                student -> {
                    if(p1.or(p2).test(student)){
                        System.out.println(student);
                    }
                }
        );
    }

    public static void printNegateStudentUsingCondition() {
        System.out.println("------printNegateStudentUsingCondition--------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(
                student -> {
                    if(p1.negate().test(student)){
                        System.out.println(student);
                    }
                }
        );
        System.out.println("-------printNegateStudentUsingCondition-moreExample-----");
        studentList.forEach(
                student -> {
                    if(p1.or(p2).negate().test(student)){
                        System.out.println(student);
                    } else {
                        System.out.println(student);
                    }
                }
        );
    }
}
