package com.modernjava.parallelstreams;

import java.util.stream.IntStream;

// Parallel streams split source data into multiple parts
// process them parallelly
//combine the result and output the result
//parallel stream leverage multicore processors,resulting in a substantial increase
//in performance
//parallel streams uses the fork/join framework go introduced in java7
//2 ways to create parallel stream
//1. calling the parallelStream() method on a collection
//2. calling the parallel() method on a stream
//How many threads are created ??
//no of threads created == no.of processors available in the machine
public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("sum sequential "+sumOfSequentialStream());
        System.out.println("sum parallel "+sumParallelStream());
    }
    public static int sumOfSequentialStream(){
       return IntStream.rangeClosed(0,50000).sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }

}
