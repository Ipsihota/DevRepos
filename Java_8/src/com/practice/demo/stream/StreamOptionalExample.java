package com.practice.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOptionalExample {
    private static Optional<Integer> getMutiplyResWithoutIdentity(List<Integer> integerList){
//        return integerList.stream().reduce((x,y) -> x*y); -> complilation issue with out identity returnType
                                                            // will be Optional<java.lang.Integer>
        return integerList.stream().reduce((x,y)->x*y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,9);
//        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> result = getMutiplyResWithoutIdentity(integerList);
        if(result.isPresent()){
            System.out.println("getMutiplyResWithoutIdentity :" + result.get());
        }else {
            System.out.println("No result found, array list may empty!! " + result);
        }
    }
}
