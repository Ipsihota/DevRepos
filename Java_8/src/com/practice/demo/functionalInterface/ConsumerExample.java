package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = student -> System.out.print(student.getName() + "-> ");
    static Consumer<Student> c2 = student -> System.out.println(student.getActivities());
    static Consumer<Student> studentConsumer = student -> System.out.println(student.toString());
    static Consumer<Student> c3 = student -> System.out.println(student.getGradeLevel());

    public static void printAll(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
    }

    public static void printName_Activities(){
        System.out.println("-----printName_Activities-------");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1.andThen(c2)); // Consumer Chaining
    }

    public static void printName_ActivitiesUsingCondition(){
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("-----printName_ActivitiesUsingCondition-------");
        students.forEach(
                (student -> {
                    if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                        c1.andThen(c3).accept(student);
                    }
                })
        );
    }

    public static void main(String[] args) {
        //before Java8
        String s = "java";
        System.out.println("Result: " + s.toUpperCase());

        // In Java8
        Consumer<String> stringConsumer =
        (p)-> System.out.println(p.toUpperCase());

        stringConsumer.accept("java8");
        //Foreach default method
        printAll();

        //printName_Activities-> consumer chaining
        printName_Activities();
        //printName_ActivitiesUsingCondition
        printName_ActivitiesUsingCondition();
    }
}
