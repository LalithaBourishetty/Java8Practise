package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collectors class Mapping method takes a function and another collector,
//and creates a new collector which apply the function and then collects the mapped
//elements using the given collectors
//Collectors.mapping(Instructor::getName,Collectors.toList()) why we need this whe we already have something like below
//.map(Instructor::getName).collect(Collectors.toList())
//Collectors.mapping used in downstream collectors
public class CollectorsMappingExample {
    public static void main(String[] args) {
        List<String> list = Instructors.getAllInstructors().stream()
                .map(i->i.getName())
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---------------------------------");

        //using mapping
        list = Instructors.getAllInstructors().stream()
                .collect(Collectors.mapping(i->i.getName(),Collectors.toList()));
        list.forEach(System.out::println);

        //grouping instructors by their years of exp.
        Map<Integer,List<String>> mapYearsofExpAndNames = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy((i->i.getYearsOfExperience()),
                        Collectors.mapping(Instructor::getName,Collectors.toList())));
        mapYearsofExpAndNames.forEach((key,value)-> System.out.println("key "+key+" value "+value));
    }
}
