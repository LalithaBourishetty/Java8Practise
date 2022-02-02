package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        //erturning instructor sorted by their name and have more than 10 years of experience
        List<Instructor> list= Instructors.getAllInstructors().stream()
                .filter(instructor -> instructor.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
