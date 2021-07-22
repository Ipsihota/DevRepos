package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> integerBiConsumer = (a,b) ->{
            System.out.println("Result of Multiplication :" + (a*b));
        };
        integerBiConsumer.accept(5, 10);

        BiConsumer<String, String> strBiConsumer = (a,b) ->{
            System.out.println("Display :" + a + " & " + b);
        };
        strBiConsumer.accept("Ipsita", "Java");

        BiConsumer<Integer, Integer> biConsumer1 = (a,b) ->{
            System.out.println("Result of Division :" + (a/b));
        };
        biConsumer1.accept(100, 20);

        System.out.println("---------Chaining-----------");
        biConsumer1.andThen(integerBiConsumer).accept(10, 5);

        printStudentsNameAndActivities();
    }

    public static void printStudentsNameAndActivities() {
        System.out.println("---------printStudentsNameAndActivities-----------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> c1 = (s1, s2) ->
                System.out.println("Name :" + s1 + " Activities: " +s2);
        studentList.forEach(student -> {
            c1.accept(student.getName(), student.getActivities());
        });
    }
}
