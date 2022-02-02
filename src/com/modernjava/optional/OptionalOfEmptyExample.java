package com.modernjava.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        //value passed to of must present otherwise throw null pointer exception
       // Optional<String> string = Optional.of(); NPE
        Optional<String> string = Optional.of("HelloWorld");
        System.out.println("string = " + string);

        System.out.println(" optional string example "+getWords());

    }
    public static Optional<String> getWords(){
        String[] words = new String[10];
        words[1] = "test optional";
        Optional<String> string=Optional.ofNullable(words[1]);
        if(string.isPresent())
            return string;
        else
            return Optional.empty();
    }
}
