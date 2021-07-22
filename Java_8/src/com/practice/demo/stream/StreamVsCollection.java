package com.practice.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jacklin");
        names.add("James");
        names.add("Jaccob");

        names.remove(0);

        System.out.println("ArrayList: " + names);

        System.out.println("Iterating through for-each external iteration");
        for (String x:names) {
            System.out.println(x);
        }

        System.out.println("--------------Stream-------------------");
        //add and remove operations are not possible here!!
//        names.stream().add;
//        names.stream().remove;
        System.out.println("Iterating through for-each Stream, internal iteration!!!");
        names.stream().forEach(System.out::println);
        // multiple time traverse, not allowed, as stream is closed/operated!!!
        Stream<String> stringStream = names.stream();
        stringStream.forEach(System.out::println);
//        stringStream.forEach(System.out::println); Exception in thread "main" java.lang.IllegalStateException :
//        stream has already been operated upon or closed
    }
}
