package com.modernjava.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//mapToObj The mapToObj() method in the numeric stream returns an object values stream
//mapToLong it returns a LongStream consisting of the results of the given function
//mapToDouble it returns a DoubleStream consisting of the results of the given function
public class StreamMaptoExample {
    public static void main(String[] args) {
        //mapToObj
        List<RandomIds> randomIdsList= IntStream.rangeClosed(1,9).mapToObj(i->{
            return new RandomIds(i, ThreadLocalRandom.current().nextInt(500));
        }).collect(Collectors.toList());
        randomIdsList.forEach(System.out::println);
        System.out.println("-------------------------------");

        //mapToLong
        LongStream longStream = IntStream.rangeClosed(1,9).mapToLong(i->(long)i);
        longStream.forEach(System.out::println);
        System.out.println("--------------------------------");

        //mapToDouble
        DoubleStream doubleStream = LongStream.rangeClosed(1,9).mapToDouble(i->(double)i);
        doubleStream.forEach(System.out::println);

    }
}

class RandomIds{
    int id;
    int randomNumbers;

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }
}
