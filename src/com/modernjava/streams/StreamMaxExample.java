package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        //
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //max using stream max function
        Optional result = numbers.stream()
                .max((a,b)->a.compareTo(b)); // replaced as Integer::compareTo
        System.out.println(result);

        int result1 = numbers.stream()
                //0,1 -> 1
                //1,2 -> 2
                //2,3 ->3 ....
                .reduce(0,(a,b)-> a>b?a:b);
        System.out.println(result1);

        Optional result3 = numbers.stream()
                .reduce((a,b)-> a>b?a:b);
        System.out.println(result3);

        Optional result4 = numbers.stream()
                .reduce(Integer::max);
        if(result4.isPresent())
        System.out.println(result4.get());

    }
}
