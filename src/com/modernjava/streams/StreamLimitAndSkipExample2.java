package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//limit: takes long argument n and returns a stream of size no more than n
//skip: takes long argument n and returns a stream after removing first n elements
public class StreamLimitAndSkipExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> limit5Numbers = numbers.stream()
                .limit(5).collect(Collectors.toList());
        limit5Numbers.forEach(System.out::println);
        System.out.println("---------------------------------------");
        List skip5Numbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        skip5Numbers.forEach(System.out::println);
    }
}
