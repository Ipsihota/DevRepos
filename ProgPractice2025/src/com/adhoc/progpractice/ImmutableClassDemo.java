package com.adhoc.progpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ImmutableClassDemo {

    public static void main(String[] args) {
//        final Person p = new Person(null, null, null, null, null);
        // p = new Person(); not allowed

        Date dob = new Date(2000-1900, 0, 10);
        Address address = new Address("123 Main St", "Anytown", "12345");
        List<Person> family = new ArrayList<>();
        family.add(new Person("Alice", 1234567890L, new Date(1998-1900, 10, 15), new Address("456 Oak Ave", "Anytown", "12345"), Collections.emptyList()));

        Person person = new Person("John Doe", 1234567890L, dob, address, family);

        System.out.println(person.getName()); // "John Doe"

//         person.getDob().setDate(20);
//        System.out.println(person.getDob());

    }
}
