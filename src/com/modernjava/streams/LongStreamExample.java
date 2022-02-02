package com.modernjava.streams;

import java.util.Random;
import java.util.stream.LongStream;

//LongStream used to generate a stream of long primitive values

public class LongStreamExample {
    public static void main(String[] args) {
        // using of
        LongStream numbers = LongStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
        System.out.println("------------------------------");

        //using iterate
        numbers = LongStream.iterate(0,i->i+5).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("------------------------------");

        //generate
        numbers = LongStream.generate(new Random()::nextLong).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("------------------------------");

        //range
        numbers = LongStream.range(1,5); // 5 is exclusive
        numbers.forEach(System.out::println);
        System.out.println("------------------------------");

        //range closed
        numbers = LongStream.rangeClosed(1,5);// 5 is inclusive
        numbers.forEach(System.out::println);

    }
}
