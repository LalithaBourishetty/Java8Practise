package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsGroupingMinMaxAvgExample {
    public static void main(String[] args) {
        //grouping the instructors in two sets of oline courses vs not online courses
        //and get the max years of experience of the instructors

        Map<Boolean, Optional<Instructor>> maxBi= Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(i->i.getYearsOfExperience()))));
        maxBi.forEach((key,value)->{
            System.out.println("key = " + key+" value = " + value);
        });
        System.out.println("----------------------------------");
        //collectingAndThen
        Map<Boolean, Instructor> maxBi1= Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(i->i.getYearsOfExperience())),
                                Optional::get)));
        maxBi1.forEach((key,value)->{
            System.out.println("key = " + key+" value = " + value);
        });
        System.out.println("------------------------------");

        //cal avg years of exp of instructors who teaches online
      Map<Boolean,Double> average =Instructors.getAllInstructors().stream()
              .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
              Collectors.averagingInt(Instructor::getYearsOfExperience)));

      average.forEach((key,value)-> System.out.println("key " + key+" Value "+value));

      //drive a statistical summary from properties of grouped items
        Map<Boolean, IntSummaryStatistics> summary =Instructors.getAllInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt(Instructor::getYearsOfExperience)));

        summary.forEach((key,value)-> System.out.println("key " + key+" Value "+value));


    }
}
