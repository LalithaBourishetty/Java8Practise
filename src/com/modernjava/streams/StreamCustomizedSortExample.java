package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//customized sort using comparator
public class StreamCustomizedSortExample {
    public static void main(String[] args) {
        // returning all instructors sorted by their name
        List<Instructor> list = Instructors.getAllInstructors().stream()
                .sorted(Comparator.comparing((Instructor instructor) -> instructor.getName()).reversed())
                .collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
