package com.practice.demo.functionalInterface;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> supplierVar = () -> {
          return new Student("Adam1",5,3.9, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };

        System.out.println("Student List: " + supplierVar.get());

        Supplier<List<Student>> listSupplier = ()-> StudentDataBase.getAllStudents();
        System.out.println("All Student List: " + listSupplier.get());
    }
}
