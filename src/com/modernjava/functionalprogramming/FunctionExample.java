package com.modernjava.functionalprogramming;

import java.util.Locale;
import java.util.function.Function;

//Function interface introduced in java 8 to implement functional programming
//it is part of java.util.function package
//it takes one argument and returns the result

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> sqrt = (x) -> Math.sqrt(x);
        System.out.println("sqrt of 64 "+sqrt.apply(64));

        Function<String,String> lowerCaseFunction = s->s.toLowerCase(Locale.ROOT);
        System.out.println(lowerCaseFunction.apply("PROGRAMMING"));

        Function<String,String> concatenateFunction = s -> s.concat(" In Java");

        System.out.println(lowerCaseFunction.andThen(concatenateFunction).apply("PROGRAMMING"));

        // first concate is done then lowercasefucntion applied on the whole concatenated string
        System.out.println(lowerCaseFunction.compose(concatenateFunction).apply("PROGRAMMING"));

    }
}
