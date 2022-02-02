package com.modernjava.functionalprogramming;

//UnaryOperator Extends java.util.function.Function
//It takes one parameter and returns parameter of same type.

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary= i -> i*10;
        System.out.println(unary.apply(10));

        // Function and UnaryOperator are same
        // When input and out put both are of same type then use unary operator instead of Function
        Function<Integer,Integer> function = i->i*10;
        System.out.println(function.apply(10));

        IntUnaryOperator intUnaryOperator = i->i*10;
        System.out.println(intUnaryOperator.applyAsInt(10));

        LongUnaryOperator longUnaryOperator = i ->i*10;
        System.out.println(longUnaryOperator.applyAsLong(10000000L));

        DoubleUnaryOperator doubleUnaryOperator = i->i*10;
        System.out.println(doubleUnaryOperator.applyAsDouble(36.9));
    }
}
