package com.practice.demo.methodReference;

import com.practice.demo.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentFunction = Student::new;
    public static void main(String[] args) {
        System.out.println("Supplier constructor :" + studentSupplier.get());
        System.out.println("Function constructor : " + studentFunction.apply("Name1"));
    }
}
