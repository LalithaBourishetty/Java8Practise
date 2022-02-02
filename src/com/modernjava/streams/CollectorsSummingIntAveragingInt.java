package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructors;

import java.util.stream.Collectors;

// Collectors.summingInt() returns a collector that construct sum of the integer valued
//function applied to the input elements
//Collectors.averageInt returns a collector that construct average of the integer valued
//function applied to the input elements
public class CollectorsSummingIntAveragingInt {
    public static void main(String[] args) {
        // sum of years of exp. of all instructors
        int sum = Instructors.getAllInstructors().stream()
                .collect(Collectors.summingInt(i -> i.getYearsOfExperience()));
        System.out.println("sum = " + sum);
        // average of years of experience of all the instructors
        double average = Instructors.getAllInstructors().stream()
                .collect(Collectors.averagingInt(i->i.getYearsOfExperience()));
        System.out.println("average = " + average);

    }
}
