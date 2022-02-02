package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//map() is a intermediate method which takes a stream returns another stream
// in output
//this map() is not same as Collectors.toMap
//Collectors.toMap  returns HashMap
//.peek() can be used to debug streams
public class MapExample {
    public static void main(String[] args) {
        // return only instructor names from the list of of instructors
        List<String> list = Instructors.getAllInstructors().stream()
                .map(x->x.getName())
                .map(x->x.toUpperCase())
                .peek(s->System.out.println(s))
                .collect(Collectors.toList());
        System.out.println(list); // in list the elements in which order they added that is preserved and it allows duplicates
        Set<String> set = Instructors.getAllInstructors().stream()
                .map(x->x.getName())
                .map(x->x.toUpperCase())
                .peek(s->System.out.println(s))
                .collect(Collectors.toSet());
        System.out.println(set); // in set the elements in which order they added that is not preserved and duplicates not allowed in set
    }
}
