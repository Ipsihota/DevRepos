package com.adhoc.progpractice;

public class Employee {
    public int id;
    String name;
    String addr;

    public Employee(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
