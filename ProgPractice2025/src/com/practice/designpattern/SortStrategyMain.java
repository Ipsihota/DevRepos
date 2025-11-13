package com.practice.designpattern;

public class SortStrategyMain {
    static void main(String[] args) {

        SortingContext context = new SortingContext(new BubbleSortStrategy());
        String[] array1 = {"cpp","c","java","python3","html","css","javascript","xml"};
        context.performSort(array1);

    }
}
