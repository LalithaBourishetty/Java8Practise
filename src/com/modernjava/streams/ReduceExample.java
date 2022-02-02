package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Reduce is the repeated process of the combining all elements
//It takes an input of elements and combines them into a single result by repeated
//application of a combining operation for example sum,multiplication and division of elements
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results = numbers.stream()
                //0+1=1 identity = 0
                //1+2=3 identity holds 1
                //3+3 = 6 identity holds 3 and so on... and the final is
                //36+9 = 45
                .reduce(0,(a,b)->a+b);
        System.out.println(results);

        long multiplyResult =numbers.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(multiplyResult);

        Optional<Integer> intResult = numbers.stream()
                .reduce((a,b)->a+b);
        if(intResult.isPresent())
        System.out.println(intResult);

    }
}
