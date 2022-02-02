package com.modernjava.streams;

// A stream is a sequence objects that supports various methods which can be pipelined to produce the desired results
// Java8 Stream should not be confused with Java I/O Stream they have very little to do with each other
// it is used to process collection of objects
//java.util.Stream supports map,reduce, filter etc..
// Streams take collection objects, array objects,I/O resources
//Stream is not a data structure
//Stream does nto change the original data structure from which it is constructed, it only returns results as per the pipeline operations performed
//Each intermediate operation is lazily performed and return stream which can be pipelined with further operations
//parallel operations are easy to perform with stream api without having to spawn multiple threads explicitly

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * Intermediate operations on streams returns streams
 * map
 * filter filters the result based on predicate passed
 *  sorted sort the stream based on comparator
 * */
/*
 * Terminal operation produces non streams as output as primitive value,collection no value at all
 * collect
 * forEach
 * reduce
 * */
public class StreamExample {
    public static void main(String[] args) {
     // creating a map of names and course of instructors who teach online
      // have more than 10 years of experience
        Predicate<Instructor> p1=instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> p2= i-> i.getYearsOfExperience() > 10;

        List<Instructor> instructorList = Instructors.getAllInstructors();
        Map<String,List<String>> map= instructorList.stream()
                                        .filter(p1)
                                        .filter(p2)
                                        .collect(Collectors.toMap(i->i.getName(),i->i.getCourses()));
        System.out.println(map);

    }
}
