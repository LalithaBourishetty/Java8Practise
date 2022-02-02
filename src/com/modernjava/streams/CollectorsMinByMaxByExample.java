package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

//Collectors.minBy() returns a Collector that produces the minimal element
//according to the given comparator
// Optional minBy(Comparator comparator)
//Collectors.maxBy() returns a Collector that produces the maximal element
//according to a given Comparator
//Optional maxBy(Comparator comparator)
//These Collectors.minBy,Collectors.maxBy used in downstream operations
public class CollectorsMinByMaxByExample {
    public static void main(String[] args) {
            // instructor with minimum years of exp.
        Optional<Instructor> instructor = Instructors.getAllInstructors().stream()
                .collect(Collectors.minBy(Comparator.comparing(i->i.getYearsOfExperience())));
        System.out.println("instructor = " + instructor);

        instructor =Instructors.getAllInstructors().stream()
                .min(Comparator.comparing(i->i.getYearsOfExperience()));
        System.out.println("instructor = " + instructor);

        // maxBy
        instructor = Instructors.getAllInstructors().stream()
                .collect(Collectors.maxBy(Comparator.comparing(i->i.getYearsOfExperience())));
        System.out.println("instructor = " + instructor);

        instructor =Instructors.getAllInstructors().stream()
                .max(Comparator.comparing(i->i.getYearsOfExperience()));
        System.out.println("instructor = " + instructor);

    }
}
