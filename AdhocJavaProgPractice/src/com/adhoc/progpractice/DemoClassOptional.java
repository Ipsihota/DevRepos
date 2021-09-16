package com.adhoc.progpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoClassOptional {
    public static void main(String[] args) {

        List<String> contryList = null;//new ArrayList<>();
//        contryList.add("India");
//        contryList.add("USA");
//        contryList.add("UK");

//        for (int i = 0; i < contryList.size(); i++) {
//            System.out.println(contryList.get(i));
//        }
        Optional<List<String>> optList = Optional.ofNullable(contryList);

        if(optList.isPresent()) {
            contryList.stream().forEach(x -> System.out.println(x));
        } else {
            System.out.println("List is empty!!!");
        }

    }
}
