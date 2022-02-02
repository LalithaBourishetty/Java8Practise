package com.modernjava.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
    public static void main(String[] args) {
        //USeCase : Map of instructors with name and years of exp
        //Function which takes list of instructors and returns map<name,no.of years of exp> who has online courses
        List<Instructor> instructors = Instructors.getAllInstructors();

        Predicate<Instructor> p=(x) -> x.isOnlineCourses() == true;

        Function<List<Instructor>, Map<String,Integer>> mapValue = (instructorList)-> {
            Map<String,Integer> map=new HashMap<>();
            instructorList.forEach(instructor -> {
                if(p.test(instructor))
                map.put(instructor.getName(),instructor.getYearsOfExperience());
            });
            return map;
        };
        System.out.println(mapValue.apply(instructors));


    }
}
