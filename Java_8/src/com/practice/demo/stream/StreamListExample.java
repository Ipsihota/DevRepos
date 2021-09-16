package com.practice.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListExample {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Ipsita");
//        names.add("Jhon");
//        names.add("Jack");
//        names.add( "Smith");
//        names.add( "Iqa");
        List<String> names = Arrays.asList("Ipsita");


        List<String> namesList = new ArrayList<>();
        namesList = names.stream().filter(s -> s.startsWith("I")).collect(Collectors.toList());
//        System.out.println(namesList);
        namesList.stream().forEach(x->System.out.println(x));
    }
}
