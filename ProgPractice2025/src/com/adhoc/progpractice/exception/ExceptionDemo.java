package com.adhoc.progpractice.exception;

import com.adhoc.progpractice.Employee;

public class ExceptionDemo {
    public static void main(String[] args) throws RuntimeException {
        Employee e1 = new Employee(101, "Jay K", "Address123");

        try {
            validation1(e1);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException(e);
        }
//        validation2(e1);
        System.out.println("End of the row!");

    }

    private static void validation2(Employee e1) {

        try {
            if (e1.id != 111) {
                throw new EmployeeNotFoundException("Alert! Employee is missing from the record.");
            }
        } catch (EmployeeNotFoundException e) {
            System.out.println("Inside catch!");
        }

        finally {
            System.out.println("Inside Finally!");
        }
    }

    private static void validation1(Employee e1) throws EmployeeNotFoundException {
        try {
            if (e1.id != 111) {
                throw new EmployeeNotFoundException("Alert! Employee is missing from the record.");
            }
        } catch (EmployeeNotFoundException e) {
            throw e;
        }

        finally {
            System.out.println("Inside Finally!");
        }
    }
}
