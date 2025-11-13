package interview.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoClass {
    static void main(String[] args) {

        String str = "under build on terrace take dinner build under umbrella under taker dining under restaurant take";

        String [] strArr = str.split(" ");

                Arrays.stream(strArr)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(stringLongEntry -> stringLongEntry.getValue()==2 && stringLongEntry.getKey().contains("u"))
                        .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey()));

//        List<String> result = Arrays.stream(str.split(" "))
//                .collect(Collectors.collectingAndThen(
//                        Collectors.groupingBy(Function.identity(), Collectors.counting()),
//                        map -> map.entrySet().stream()
//                                .filter(entry -> entry.getValue() == 2 && entry.getKey().contains("u"))
//                                .map(Map.Entry::getKey)
//                                .collect(Collectors.toList())
//                ));
//
//        System.out.println("Words occurring twice and containing 'u': " + result);

//        System.out.println(result);

//        Map<String, Long> wordCounts = Arrays.stream(str.split(" "))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println("All words containing 'u' and their counts:");
//        wordCounts.entrySet().stream()
//                .filter(entry -> entry.getKey().contains("u"))
//                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue() + " times"));
//
//        System.out.println("\nWords that occur exactly twice and contain 'u':");
//        wordCounts.entrySet().stream()
//                .filter(entry -> entry.getValue() == 2 && entry.getKey().contains("u"))
//                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue() + " times"));
    }


    static void main1(String[] args) {

        int []arr1 = {1,2,3};
        int []arr2 = {1,5,3};
        int []arr3 = {1,2,3};
        var list = Arrays.asList(arr1, arr2, arr3);

        // set can be used overriding hash code and equals

        var setElem = new HashSet<Object>();

        for (int i = 0; i < list.size(); i++) {

           // boolean isAllowed =
//            setElem.add(list.get(i));


        }


    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
