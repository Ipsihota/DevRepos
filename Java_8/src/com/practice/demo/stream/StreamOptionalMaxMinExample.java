package com.practice.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOptionalMaxMinExample {
    public static void main(String[] args) {
        List<Integer> elm = Arrays.asList(10,80,20,50);
       //With Identity MAX
        System.out.println("Max value: " + getMaxElemFromList(elm));
       //Without Identity MAX
        Optional<Integer> maxRes = getMaxElemFromListWithoutIdentity(elm);
        if(maxRes.isPresent()){
            System.out.println("getMaxElemFromListWithoutIdentity: " + maxRes.get());
        }else{
            System.out.println("No result found, list may empty !!" + maxRes);
        }
        //With Identity MIN
        System.out.println("Min value: " + getMinElemFromList(elm)); // in such cases we should not use identity.

        //Without Identity MIN
        Optional<Integer> minRes = getMinElemFromListWithoutIdentity(elm);// this approach is recommended!!
        if(minRes.isPresent()){
            System.out.println("getMinElemFromListWithoutIdentity: " + minRes.get());
        }else{
            System.out.println("No result found, list may empty !!" + minRes);
        }
    }

    private static Optional<Integer> getMinElemFromListWithoutIdentity(List<Integer> elm) {
        return elm.stream().reduce((a,b)->a<b?a:b);
    }

    private static int getMinElemFromList(List<Integer> elm) {
        return elm.stream().reduce(0,(a,b)->a<b?a:b); // output -> 0
    }

    private static Optional<Integer> getMaxElemFromListWithoutIdentity(List<Integer> elm) {
        return elm.stream().reduce((a,b)->a>b?a:b);
    }

    private static int getMaxElemFromList(List<Integer> elm) {
        return elm.stream().reduce(0, (a,b) -> a>b?a:b);
    }
}
