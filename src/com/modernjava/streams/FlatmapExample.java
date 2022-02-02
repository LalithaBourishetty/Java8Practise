package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//flat map is a combination of map and flat methods
//it flattens the stream in layman terms flattening is referred to as merging multiple collections/arrays into one
public class FlatmapExample {
    public static void main(String[] args) {
        // get the list of all the course which instructor offers
        /*List<String> insrtuctorCourses = Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .collect(Collectors.toList());*/
        List<String> insrtuctorCourses = Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toList());
        System.out.println(insrtuctorCourses);

        // to remove duplicates use Set
        Set<String> insrtuctorset = Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toSet());
        System.out.println(insrtuctorset);

    }
}
