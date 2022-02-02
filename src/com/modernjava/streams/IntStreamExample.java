package com.modernjava.streams;
//IntStream is a stream of primitive int values

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        //using of
        IntStream numbers=IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
        System.out.println("----------------------------");

        //using iterate
        numbers = IntStream.iterate(0,i->i+2).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("----------------------------");

        //using random generator
        numbers=IntStream.generate(new Random()::nextInt).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("----------------------------");

        //using range
        numbers= IntStream.range(1,5); // 1,2,3,4 NOTE : 5 is exclusive here
        numbers.forEach(System.out::println);
        System.out.println("----------------------------");
        //using rangeclosed
        numbers= IntStream.rangeClosed(1,5); // 1,2,3,4 NOTE : 5 is inclusive here
        numbers.forEach(System.out::println);

    }
}
