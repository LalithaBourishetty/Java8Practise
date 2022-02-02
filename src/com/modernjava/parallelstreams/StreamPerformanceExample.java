package com.modernjava.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceExample {
    public static void main(String[] args) {
        int loop = 20;
        //long result = measurePerformance(() -> sumSequentialStream(),loop); can be replaced as below
        long result = measurePerformance(StreamPerformanceExample::sumSequentialStream, loop);
        System.out.println("Time taken to process sum in sequential = " + result);

        result = measurePerformance(StreamPerformanceExample::sumParallelStream, loop);
        System.out.println("Time taken to process sum in parallel = " + result);
    }

    public static long measurePerformance(Supplier<Integer> supplier, int numberofTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberofTimes; i++)
            supplier.get();
        return System.currentTimeMillis() - startTime;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 50000).sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(0, 50000).parallel().sum();
    }
}
