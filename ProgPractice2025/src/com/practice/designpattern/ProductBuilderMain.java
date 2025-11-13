package com.practice.designpattern;

public class ProductBuilderMain {
    static void main(String[] args) {
        Product p = new Product.Builder().prodName("product1").price(10.11).qty(2).build();

        System.out.println(p.getProdName());
    }
}
