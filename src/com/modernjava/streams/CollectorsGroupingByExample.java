package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collectors.groupBy() provides similar functionality as SQL's GROUP BY clause
//The output of groupingBy is Map<key,value>
//3 overloaded methods of groupby
//groupingBy(classifier)
//groupingBy(classifier,downstream)
//groupingBy(classifier,mapfactory,downstream)
public class CollectorsGroupingByExample {
    public static void main(String[] args) {
        // group list of names by their length
        List<String> names = List.of("test","raju","mike","rajee","lalitha");
        Map<Integer,List<String>> map=names.stream().collect(Collectors.groupingBy(i->i.length()));
        System.out.println("map = " + map);
        System.out.println("-----------------------");

        //grouping by instructors by their gender
        Map<String,List<Instructor>> instructor = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
       instructor.forEach((key,value)->{
           System.out.println("key "+key+" value "+value);
       });

       //groupby experience where >10 years of experienced is classified
        //as the senior other are junior
        Map<String,List<Instructor>> instructorByExperience = Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(i -> i.getYearsOfExperience()>10 ? "SENIOR":"JUNIOR"));
        instructorByExperience.forEach((key,value) -> {
            System.out.println("key "+key+" "+value);
        });
    }
}
