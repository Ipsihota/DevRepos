package interview.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProb {

    static void main(String[] args) {
        List<String> list = List.of("Lion", "Tiger", "Lion", "Parrot", "Lion", "Tiger", "Snake", "Snake", "apple");
        int k = 3;

        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((l1, l2) -> l2.getValue().compareTo(l1.getValue()))
                .limit(k).map(Map.Entry::getKey).collect(Collectors.toList()));

//        Map<String, Integer> strMap = new HashMap<>();
//
//        for (String str : list){
//
//            if(strMap.containsKey(str)) {
//                strMap.put(str, strMap.get(str)+1);
//            }
//            else {
//                strMap.put(str, 1);
//            }
//        }
//
//        for (String str : list) {
//
//        }
    }


    static void main1(String[] args) {
        String [] inputs = {"flower", "flow", "flight"};

        // list contains common prefix

        String first = inputs[0];

        int prefixLength = (int) Stream.iterate(0, integer -> integer + 1).limit(first.length())
                .takeWhile(i -> Arrays.stream(inputs)
                        .allMatch(s -> s.length() > i && s.charAt(i) == first.charAt(i))).count();


        System.out.println(first.substring(0, prefixLength));

//        StringBuilder sb = new StringBuilder();

//        int index = 0;
//        for (int i = 0; i < inputs.length; i++) {
//            for (int j = 1; j < inputs.length; j++) {
//                if(inputs[index].substring(i).equals(inputs[j].substring(index))){
//                    // sb.append(inputs[i].substring(i));
//                }
//            }
//        }
    }
}
