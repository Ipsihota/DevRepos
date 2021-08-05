package com.practice.demo.optional;

import com.practice.demo.data.Bike;
import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.Optional;

public class OptionalFlatMapExample {
    public static void main(String[] args) {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName)
        .ifPresent(s -> System.out.println("Bike Name:" + s));
    }
}
