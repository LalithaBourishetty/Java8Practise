package com.modernjava.functionalprogramming;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

//BiFunction is used to implement functional programming in java
//It is in java.util.function
//It takes two arguments as input and return the result
public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs List<Instructor>,Predicate which will filter if instructor has online course
        //and return a map of <String,integer> String is name and Integer is no. of years of experience
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String,Integer>> mapBiFunction=
                (list,predicate)->{
                    Map<String,Integer> map= new HashMap<>();
                    list.forEach(instructor -> {
                        if(predicate.test(instructor))
                            map.put(instructor.getName(),instructor.getYearsOfExperience());
                    });
                    return map;
                };

        Predicate<Instructor> p1 = (x) -> x.isOnlineCourses() == true;

        System.out.println(mapBiFunction.apply(Instructors.getAllInstructors(),p1));
    }
}
