package com.modernjava.functionalinterface;

//Predicate is a functional interface in java.util.function
//it is a single argument function which returns true/false
//Predicate has test method which returns true/false

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // if number is >10 return true other false
        Predicate<Integer> predicate=(x) -> x>10;
        System.out.println(predicate.test(20));

        //if x>10 && x is even
        Predicate<Integer> predicate1=(x) -> x%2==0;
        System.out.println(predicate.and(predicate1).test(20));

        //if x>10 || x is even
        System.out.println(predicate.or(predicate1).test(36));

        //ifx>10 && x is odd
        System.out.println(predicate.and(predicate1.negate()).test(369));

    }
}
