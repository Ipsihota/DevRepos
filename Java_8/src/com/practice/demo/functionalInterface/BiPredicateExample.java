package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
    // Goal: Need to print Name and activities of students, those have grade>=3 & gpa>=3.9

    //Set the Bi-predicate for condition grade>=3 & gpa>=3.9
    static BiPredicate<Student, Student> biPredicate1 = (s1, s2)->
        (s1.getGradeLevel()>=3 && s2.getGpa()>=3.9);


    //Set Biconsumer to print name and activities
    static BiConsumer<String, List<String>> b1 = (name, activities)-> System.out.println(name + ": " + activities);

    //Combine above to achieve goal using Consumer!!
    static Consumer<Student> c1 = student -> {
        if(biPredicate1.test(student,student)){
            b1.accept(student.getName(), student.getActivities());
        }
    };
    
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
       printNameActivities(studentList);
    }

    private static void printNameActivities(List<Student> studentList) {
        //Iterate and will show required results
        studentList.forEach(c1);
    }
}
