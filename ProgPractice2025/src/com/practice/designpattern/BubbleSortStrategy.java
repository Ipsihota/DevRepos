package com.practice.designpattern;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(String [] a) {
        System.out.println("BubbleSort");
    }
}
