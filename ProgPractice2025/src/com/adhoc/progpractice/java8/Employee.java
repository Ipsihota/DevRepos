package com.adhoc.progpractice.java8;

public class Employee {
    String name;
    Integer sal;
    Integer id;
    String dept;

    public Employee(String name, Integer sal) {
        this.name = name;
        this.sal = sal;
    }

    public Employee(Integer id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Integer getSal() {
        return sal;
    }

    public Integer getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }
}
