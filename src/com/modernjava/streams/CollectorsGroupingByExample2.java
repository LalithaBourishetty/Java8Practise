package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupingBy(classifier,downstream)
public class CollectorsGroupingByExample2 {
    public static void main(String[] args) {
        List<String> names = List.of("sid","mike","jenny","gene","Rajeev");
        //grouping by length of the string and also checking their names contains e
        // and only return those nales which has e
        Map<Integer,List<String>> map = names.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.filtering(i->i.contains("e"),Collectors.toList())));
        map.forEach((key,value)->System.out.println("key "+key+" value "+value));

        //instructor grouping them by senior and junior  where senior >10years of exp and rest all junior
        //and filter them on online courses
       Map<String,List<Instructor>> mapYearsOfExp = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(i->i.getYearsOfExperience()>10? "SENIOR":"JUNIOR",
                        Collectors.filtering(i->i.isOnlineCourses(),Collectors.toList())));
       mapYearsOfExp.forEach((key,value)-> System.out.println("Key "+key+" value "+value));
    }
}
