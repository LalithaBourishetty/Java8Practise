package com.modernjava.parallelstreams;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPerformanceExample2 {
    static long tokencount = 50000;
    public static void main(String[] args) {
        int loop = 20;
        long result = mesurePerformance(()->sortSequentialStream(),loop);
        System.out.println("Time taken to process to sort in sequential "+result);
        result = mesurePerformance(()->sortParallelStream(),loop);
        System.out.println("Time taken to process to sort in parallel "+result);
    }

    public static long mesurePerformance(Supplier<Long> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }
    public static long sortSequentialStream() {
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0,tokencount)
                .mapToObj(i-> {
                    return new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokencount));
                }).collect(Collectors.toList());
        randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

    public static long sortParallelStream() {
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0,tokencount)
                .parallel().mapToObj(i-> {
                       return new RandomTokens(i, ThreadLocalRandom.current().nextLong(tokencount));
                }).collect(Collectors.toList());
        randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }
}

class RandomTokens {
    long id;
    long tokens;

    @Override
    public String toString() {
        return "RandomTokens{" +
                "id=" + id +
                ", tokens=" + tokens +
                '}';
    }

    public RandomTokens(long id, long tokens) {
        this.id = id;
        this.tokens = tokens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTokens() {
        return tokens;
    }

    public void setTokens(long tokens) {
        this.tokens = tokens;
    }
}
