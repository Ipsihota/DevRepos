package com.adhoc.progpractice.java8;

public class Employee {
    String name;
    Double sal;
    Integer id;
    String dept;
    String gender;

    public Employee(String name, Double sal) {
        this.name = name;
        this.sal = sal;
    }

    public Employee(String name, Double sal, String gender) {
        this.name = name;
        this.sal = sal;
        this.gender = gender;
    }

    public Employee(Integer id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Double getSal() {
        return sal;
    }

    public Integer getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getGender() {
        return gender;
    }
}
