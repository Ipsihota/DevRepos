package interview.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(numbers.stream().filter(num -> num % 2 == 0  && num > 5).sorted(Comparator.naturalOrder())
                .map(num -> Math.pow(num, 2)).collect(Collectors.toList()));
    }
}
