package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    // Goal: Need to print Name and activities of students, those have grade>=3 & gpa>=3.9

    //Set the predicate for condition grade>=3 & gpa>=3.9
    Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    //Set Biconsumer to print name and activities
    BiConsumer<String, List<String>> biConsumer1 = (name, activities)
            -> System.out.println(name + ": " +activities);

    //Combine above to achieve goal using Consumer!!
    Consumer<Student> c1 = student -> {
        if(p1.and(p2).test(student)){
            biConsumer1.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }

    private void printNameAndActivities(List<Student> studentList) {
        //Iterate and will show required results
        studentList.forEach(c1);
    }
}
