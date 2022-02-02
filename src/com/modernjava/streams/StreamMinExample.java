package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional min = numbers.stream().min(Integer::compareTo);
        if(min.isPresent())
            System.out.println(min.get());

        //using reduce to find min.value
        //0,1 -> 0
        //0,2 ->0 .... final will get 0 as min
        int min1 = numbers.stream().reduce(0,(a,b)->a<b?a:b);
        System.out.println(min1);

        //to avoid above let's use reduce without identity
        Optional min2 =numbers.stream().reduce((a,b)->a<b?a:b);
        if(min2.isPresent())
        System.out.println(min2.get());

        Optional min3 =numbers.stream().reduce(Integer::min);
        if(min3.isPresent())
            System.out.println(min3.get());

    }
}
