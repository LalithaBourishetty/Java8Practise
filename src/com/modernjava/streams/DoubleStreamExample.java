package com.modernjava.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

//DoubleStream used to generate a stream of double primitive values
//DoubleStream does not provide range method as there are infinite values between two numbers
// to achieve that we can create longstream using range and convert to double stream

public class DoubleStreamExample {
    public static void main(String[] args) {
        // using of
        DoubleStream numbers = DoubleStream.of(2.4,3.5,3.6,2.6,6.9);
        numbers.forEach(System.out::println);
        System.out.println("---------------------");
        //using iterate
        numbers = DoubleStream.iterate(0, i->i+2.0).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("---------------------");
        //using generate
        numbers = DoubleStream.generate(new Random()::nextDouble).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("---------------------");

        numbers = LongStream.range(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
        System.out.println("---------------------");

        numbers = LongStream.rangeClosed(1,5).asDoubleStream();
        numbers.forEach(System.out::println);

    }
}
