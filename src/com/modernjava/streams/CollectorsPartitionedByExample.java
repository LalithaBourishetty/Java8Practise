package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Collectors.partitioningBy is used to partition a stream of objects based on
// a given predicate
//partitioningBy(predicate) returns Map<Boolean,List<T>>
//partitioningBy(predicate,downstream) returns Map<Boolean,List<T>>
public class CollectorsPartitionedByExample {
    public static void main(String[] args) {
    //partition instructors into two groups of instructors
        //first is years of exp >10 and other is <=10
        Predicate<Instructor> predicate = i -> i.getYearsOfExperience()>10;
        Map<Boolean,List<Instructor>> map = Instructors.getAllInstructors().stream()
                .collect(Collectors.partitioningBy(predicate));
        map.forEach((key,value)-> System.out.println("key "+key+" value"+value));

        System.out.println("-------------------------");
        Map<Boolean, Set<Instructor>> map1 = Instructors.getAllInstructors().stream()
                .collect(Collectors.partitioningBy(predicate,
                                Collectors.toSet()));
        map1.forEach((key,value)-> System.out.println("key "+key+" value"+value));


    }
}
