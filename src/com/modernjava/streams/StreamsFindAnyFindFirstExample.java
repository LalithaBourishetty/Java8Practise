package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Optional;

//findFirst: it returns an Optional object containing first element of the stream,or an empty Optional
//    if the stream is empty
//findAny : it returns an Optional object containing any one element of the stream,or an empty Optional
//    if the stream is empty this completely non-deterministic behavior
public class StreamsFindAnyFindFirstExample {
    public static void main(String[] args) {

        Optional<Instructor> instructor = Instructors.getAllInstructors().stream()
                .findAny();
        if (instructor.isPresent())
            System.out.println(instructor.get());

        System.out.println("-----------------------------------------");

        Optional<Instructor> instructor1 = Instructors.getAllInstructors().stream()
                .findFirst();
        if (instructor1.isPresent())
            System.out.println(instructor1.get());
    }
}
