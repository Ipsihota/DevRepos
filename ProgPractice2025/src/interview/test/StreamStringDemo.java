package interview.test;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamStringDemo {

    public static void main(String[] args) {
        String str = "StreamStringDemo";


       var duplicates = str.chars().mapToObj(ch -> (char)ch)
               .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       System.out.println(duplicates);
    }
}
