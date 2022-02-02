package com.modernjava.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Boxing -> convert a primitive values into an object type of corresponding wrapper class
//Unboxing -> convert a wrapper class to it's equivalent primitive type
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;
        IntStream intStream = IntStream.rangeClosed(1,5000); // primitive int stream
        // numbers = intStream.collect(Collectors.toList())
        numbers = intStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::println);
        System.out.println("-------------------------------");

        //unboxing
        //sum of above integers
        //using reduce
       Optional<Integer> sum = numbers.stream().reduce((a, b)->a+b);
       if(sum.isPresent())
           System.out.println("sum of numbers is "+sum.get());

       //using sum method
        int sumUsingMethod = numbers.stream().mapToInt(i->i.intValue()).sum();
        System.out.println("Sum using aggregate method "+sumUsingMethod);


    }
}
