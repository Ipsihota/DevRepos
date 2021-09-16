package com.practice.prog;

public class MyClassDemo2 {
    public static void main(String[] args) {

        demoException();
        
    }

    protected static void demoException() {
        int a= 5, i = 0, res = 0;
        try{
           res = a/i;
        } catch (Exception ex){
            System.out.println("Arithmetic exception!!!");
        } //catch(ArithmeticException e){ compilation error, as super class has already captured!!
//            System.out.println("Exception !!!!");
//        }
    }
}
