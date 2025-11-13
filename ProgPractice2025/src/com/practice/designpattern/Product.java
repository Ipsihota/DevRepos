package com.practice.designpattern;

public class Product {

    private final String prodName;
    private final double price;
    private int qty;


    private Product(Builder builder) {
        this.prodName = builder.prodName;
        this.price = builder.price;
        this.qty = builder.qty;
    }

    public String getProdName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public static class Builder {
        private String prodName;
        private double price;
        private int qty;

        public Builder prodName(String prodName) {
            this.prodName = prodName;
            return  this;
        }

        public Builder qty(int qty) {
            this.qty = qty;
            return  this;
        }

        public Builder price(double price) {
            this.price = price;
            return  this;
        }

        public Product build(){
            // Additional validation can be added here

            if (prodName.length() > 100) {
                throw new IllegalArgumentException("Product name cannot exceed 100 characters");
            }

            return new Product(this);
        }
    }
}
