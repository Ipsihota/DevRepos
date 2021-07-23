package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {
    public static void main(String[] args) {
        //collect all the name of student and display all name of student!
//        Map convert one type to another type
        List<String> listOfName = nameList();
        System.out.println("List : " + listOfName);

        Set<String> setOfName = nameSet();
        System.out.println("Set : " +setOfName);
    }

    //set of name
    protected static Set<String> nameSet() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet()); //Set<String>
    }

    // List of Student
    protected static List<String> nameList() {
        List<String> listOfName = StudentDataBase.getAllStudents().stream() //Stream<student>
        .map(Student::getName) // Student as input -> map converts to Stream<String>
        .map(String::toUpperCase) //Stream<String>, perform upperCase operation on string
        .collect(toList());
        return listOfName;
    }

}
