package com.modernjava.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        //orElse
        Integer[] numbers= new Integer[10];
        numbers[0]=1;
        Optional<Integer> number = Optional.ofNullable(numbers[0]);
        int result = number.orElse(-1);
        System.out.println("result = " + result);// result wil print 1

        //orElseGet
        number = Optional.ofNullable(numbers[1]);
        result = number.orElseGet(()-> -1);
        System.out.println("result orElseGet = " + result);

        //orElseThrow
        try {
            number = Optional.ofNullable(numbers[1]);
            result = number.orElseThrow(Exception::new);
            System.out.println("result orElseThrow = " + result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
