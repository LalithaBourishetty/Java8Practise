package com.modernjava.functionalinterface;

import java.util.function.BiConsumer;

//BiConsumer functional interface is part if java.util.function package
// It takes two input arguments and produces result
//BiConsumer does not return any value
public class BiConsumerExample {
    public static void main(String[] args) {
        //printing two numbers
        BiConsumer<Integer,Integer> biConsumer = (x,y)-> System.out.println("x: "+x+" y: "+y);
        biConsumer.accept(3,6);
        //sum of two numbers
        BiConsumer<Integer,Integer> biConsumer1 = (x,y)-> System.out.println("sum is "+(x+y));
        biConsumer1.accept(3,6);
        //concatenate strings
        BiConsumer<String,String> biConsumer2=(x,y)-> System.out.println(x+y);
        biConsumer2.accept("Welcome to ","Java Programming");



    }
}
