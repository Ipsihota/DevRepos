package com.practice.demo.optional;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.Optional;

public class OptionalStudentExample {
    public static void main(String[] args) {
        String strLen = getLengthOfString();

        if(strLen != null)
            System.out.println("Length: "+ strLen);
        else
            System.out.println("No record found!!");
// Using Optional!!!
        Optional<String> result = getLengthOfStringOptional();

        if(result.isPresent())
            System.out.println("Optional Length: "+ result.get().length());
        else
            System.out.println("No record found!!");


    }

    // In this method, found no. of null checks, can use optional instead!!
    private static String getLengthOfString() {
        Student student = StudentDataBase.studentSupplier.get();
        String name = student.getName();
        if(name!=null)
            return name.length() +"";
        else
            return null;
    }

    private static Optional<String> getLengthOfStringOptional() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(student.isPresent()){
            student.get();
            return student.map(Student::getName);}
        else
            return Optional.empty();
    }
}
