package com.adhoc.progpractice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream1 {
    public static void main1(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000),
                new Employee("Bob", 75000),
                new Employee("Charlie", 50000),
                new Employee("David", 80000),
                new Employee("Eve", 65000)
        );

        double avgSal = employees.stream().mapToDouble(Employee::getSal).average().getAsDouble();

        double maxSal = employees.stream().mapToDouble(Employee::getSal).max().getAsDouble();

        System.out.println(maxSal);

    }

    public static void main(String[] args) {
        List<Employee> emps =  List.of(
                new Employee(1,"arun","HR"),
                new Employee(2,"arun","IT"),
                new Employee(3,"mani","IT"),
                new Employee(1,"newarun","IT"),
                new Employee(4,"arul","HR"),
                new Employee(1,"arun","IT")
        );

//        emps.stream().collect(Collectors.toMap(emp->emp.getId() + emp.getName(), emp),(oldEmp, newEmp) -> oldEmp, LinkedHashMap::new)
    }
}
