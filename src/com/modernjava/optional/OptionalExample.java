package com.modernjava.optional;

import java.util.Optional;

// Optional class help in avoiding null checks
public class OptionalExample {
    public static void main(String[] args) {
       /* Integer[] numbers = new Integer[10];
        *int number = numbers[1].intValue();
        * above code throws null pointerexception
        */
        Integer[] numbers = new Integer[10];
        Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
        int optionalint = checkNullInt.isPresent()? checkNullInt.get() : -1;
        System.out.println("optionalint = " + optionalint);
    }
}
