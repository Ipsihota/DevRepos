package com.adhoc.progpractice.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("1. Find the first element from a given list!");
        List<Integer> numbers = List.of(10, 30, 101, 33, 60, 54, 50, 22, 51, 10, 30);
        numbers.stream().findFirst().ifPresent(System.out::println);

        System.out.println("2. Find the count of the element for a given list!");
        System.out.println(numbers.stream().count());

        System.out.println("3. Find the odd and even number from a given list!");
        numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);
        System.out.println();
        numbers.stream().filter(x -> x%2 != 0).forEach(System.out::println);


        System.out.println("4. Find out all the element starts with 5 from a given list!");
        numbers.stream().filter(n-> n.toString().startsWith("5")).forEach(System.out::println);

        System.out.println("5. Find out all the duplicate element from a given list!");
        Set<Integer> set = new HashSet<>();
        numbers.stream().filter(num-> !set.add(num)).forEach(System.out::println);
        set.clear();

        System.out.println("6. Find out the max and min element from a given list!");
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
        numbers.stream().min(Integer::compareTo).ifPresent(System.out::println);

        System.out.println("7. Sort list in asc!");
        numbers.stream().filter(d-> set.add(d)).sorted().forEach(System.out::println);
        set.clear();

        System.out.println("8. Sort list in desc!");
        numbers.stream().filter(d->set.add(d)).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        set.clear();


        int []arr = {10, 33, 5, 20, 99, 5, 9};
        System.out.println("9. Duplicate element presence check from array!");
        if(Arrays.stream(arr).distinct().count() != arr.length) {
            System.out.println("Duplicate Found!!!");
        } else {
            System.out.println("No Duplicate Found!!!");
        }

        System.out.println("10. Perform Square on a list and find out element greater than 40!");
        numbers.stream().map(x-> x*x).filter(num-> num>40).forEach(System.out::println);

        System.out.println("11. Perform sorting for an array!");
//        Arrays.stream(arr).filter(dup-> set.add(dup)).sorted().forEach(System.out::println);
        Arrays.sort(arr);
        Arrays.stream(arr).filter(dup-> set.add(dup)).forEach(System.out::println);

        System.out.println("12. Use map to convert words in to upper case");
//        String[] strArr = {"java", "dev", "programming"};
//        Arrays.stream(strArr).map(str -> str.toUpperCase()).forEach(System.out::println);
        List<String> strList = Arrays.asList("java", "dev", "programming");
        strList.stream().map(str->str.toUpperCase()).forEach(System.out::println);

        System.out.println("13. Maximum element in an array");
        Arrays.stream(arr).max().ifPresent(System.out::println);

        System.out.println("14. Concat two stream value!");
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        Stream<Integer> s2 = Stream.of(4, 5, 6);
        Stream.concat(s1, s2).forEach(System.out::println);

        System.out.println("15. Print 10 Random number");
        Random random = new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

        System.out.println("16. Sum of salary of employee");
        Employee emp1 = new Employee("Name1", 10000);
        Employee emp2 = new Employee("Name2", 20000);
        Employee emp3 = new Employee("Name3", 30000);
        Employee emp4 = new Employee("Name1", 10000);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println(employees.stream().mapToDouble(Employee::getSal).sum());

        System.out.println("17. Count of each character in a string");

        String words = "javaprogramming";

        Map<Character, Long> charCount = words.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);

        System.out.println("16. List of object into map considering the duplicate key and print in sorted order");
        System.out.println(employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSal, (existing, replace) -> existing, ()-> new TreeMap<>(Comparator.naturalOrder()))));

        System.out.println("17. First non repetitive character in a given string");
        String str = "aabaccdaec";

        Map<Character, Long> mapCount = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstRepetitive = mapCount.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();

        firstRepetitive.ifPresentOrElse(System.out::println, ()-> System.out.println("No repetitive char found"));
       // Average salary of male and female.
        Employee emp11 = new Employee("e1", 1000, "male");
        Employee emp12 = new Employee("e2", 10200, "female");
        Employee emp13 = new Employee("e3", 10000, "male");
        Employee emp14 = new Employee("e4", 100000, "female");
        Employee emp15 = new Employee("e5", 100000, "female");
        Employee emp16 = new Employee("e6", 80000, "male");
        Employee emp17 = new Employee("e7", 100000, "female");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp11);
        employeeList.add(emp12);
        employeeList.add(emp13);
        employeeList.add(emp14);
        employeeList.add(emp15);
        employeeList.add(emp16);
        employeeList.add(emp17);

        System.out.println("18.Average salary of male and female***********");

        Map<String, Double> avgSalaryByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSal)));
        System.out.println(avgSalaryByGender);

//        Map<String, Double> maxSalaryByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingDouble(Employee::getSal))));

    }
}
