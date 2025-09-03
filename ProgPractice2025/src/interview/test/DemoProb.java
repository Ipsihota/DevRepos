package interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoProb {
    public static void main(String[] args) {

        String str = "Ipsita Hota DLF appartment, B block, Bangalore";

        // Split the string by spaces to get an array of words
        String[] words = str.split(" ");

        // Create a stream from the array, sort it, and collect it into a list
        String sortedString = Arrays.stream(words)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedString);
    }
}
