package com.adhoc.progpractice;

public class MySingletonClass {
    private static MySingletonClass instance = null;

    private MySingletonClass(){

    }

    public static MySingletonClass getInsatnce1(){
        if(instance != null){

            instance = new MySingletonClass();
        }

        return instance;
    }

}
