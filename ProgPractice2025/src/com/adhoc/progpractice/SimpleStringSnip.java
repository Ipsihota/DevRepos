package com.adhoc.progpractice;

public class SimpleStringSnip {
    public static void main(String[] args) {
//        show(null); // compilation failed ambiguous method(String/StringBuffer - child to object)
    }

    public void show(Object o) {
        System.out.println("Got Object!");
    }

    public void show(String s) {
        System.out.println("Got String!");
    }

    public void show(StringBuffer sb) {
        System.out.println("Got StringBuffer!");
    }
}
