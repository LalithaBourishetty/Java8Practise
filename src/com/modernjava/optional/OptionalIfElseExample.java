package com.modernjava.optional;

import java.util.Optional;

public class OptionalIfElseExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        if(stringOptional.isPresent())
            System.out.println("stringOptional.get() = " + stringOptional.get());
        //ifPresent
        stringOptional.ifPresent(s-> System.out.println("ifPresent scenario s = " + s));

    }
}
