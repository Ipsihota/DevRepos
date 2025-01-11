package interview.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoJ8Class {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9, 10);

//        numbers.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
       System.out.println("Sum of even num from a given array list: " + numbers.stream().filter(x -> x%2 == 0).collect(Collectors.summingInt(Integer::intValue)));
        System.out.println("Reverse the array in desc: "+ numbers.stream().sorted(Collections.reverseOrder()).toList());
    }
}
