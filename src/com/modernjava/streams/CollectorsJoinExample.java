package com.modernjava.streams;
// Joining is terminal method
/*
*joining() concatenates into a String in the encounter order
* joining(CharSequence delimiter) concatenates in input elements into
* string separated by delimiter
* joining(CharSequence delimiter,CharSequence prefix,CharSequence suffix) it concatenates the
* input elements separated by specified delimiter,with the specified prefix and suffix in the
* encounter order
**/

import com.modernjava.functionalinterface.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoinExample {
    public static void main(String[] args) {
        String result = Stream.of("E","F","G","H").collect(Collectors.joining());
        System.out.println(result);
        String result1= Stream.of("E","F","G","H").collect(Collectors.joining(","));
        System.out.println(result1);
        String result2=Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
        System.out.println(result2);

        //instructor names separated by comma and prefix{ and suffix }
        String nameofInstructors = Instructors.getAllInstructors().stream()
                .map(i->i.getName())
                .collect(Collectors.joining(",","{","}"));
        System.out.println("nameofInstructors = " + nameofInstructors);

    }
}
