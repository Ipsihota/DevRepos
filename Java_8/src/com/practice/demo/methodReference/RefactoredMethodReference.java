package com.practice.demo.methodReference;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactoredMethodReference {
    static Predicate<Student> p1 = s-> s.getGradeLevel()>=2; // this will be refactored...
    static Predicate<Student> p2 = RefactoredMethodReference::isGradeLevelExist;

    static boolean isGradeLevelExist(Student s){
        return s.getGradeLevel()>=2;
    }
    public static void main(String[] args) {
        System.out.println("Display:" + p2.test(StudentDataBase.studentSupplier.get()));
    }
}
