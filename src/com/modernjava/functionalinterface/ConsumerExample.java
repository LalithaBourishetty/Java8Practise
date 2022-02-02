package com.modernjava.functionalinterface;
// Fuctional Interface is an interface with SAM
// Functional Interface can have multiple default and static methods in addition SAM
//Default method provide backward comapatability
//static methods are similar to static methods in class which are used for utils

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer =(x)-> System.out.println("length of given String "+x.length());
        consumer.accept("Java 8 Consumer Functional Interface Example");
    //Consumer with block statement
        Consumer<Integer> d=(x)->{
            System.out.println("square of "+x+" is "+x*x);
            System.out.println("cube of "+x+" is "+x*x*x);
        };
        d.accept(3);
    }
}
