package com.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//sum
//max
//min
public class StreamAggregateExample {
    public static void main(String[] args) {
      // sum of 1000 numbers
      int sum = IntStream.rangeClosed(1,1000).sum();
        System.out.println("sum of 1000 numbers is "+sum);

      //min
        OptionalInt min = IntStream.rangeClosed(1,1000).min();
        if (min.isPresent())
        System.out.println("minimum of 1000 numbers is "+min);

      //max
        OptionalInt max = IntStream.rangeClosed(1,1000).max();
        if(max.isPresent())
        System.out.println("Maximum of 1000 numbers is "+max);

        //average
        OptionalDouble average = LongStream.rangeClosed(1,1000).asDoubleStream().average();
        System.out.println("average of 1000 numbers is "+ (average.isPresent() ? average.getAsDouble() : 0.0));
    }
}
