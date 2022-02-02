package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructors;

import java.util.stream.Collectors;

//Counting counts the number of elements in the Stream
//why this is when we already have count method Stream.of(1,2,3,4,5).count();
//Helpful in DownStream methods
//groupingBy(String::length,counting())
public class CollectorsCountingExample {
    public static void main(String[] args) {
        //count the no.of instructors who teaches online courses
        long count = Instructors.getAllInstructors().stream()
                .filter(i->i.isOnlineCourses()).count();
        System.out.println("count = " + count);

       long count1 =  Instructors.getAllInstructors().stream()
                .filter(i->i.isOnlineCourses()).collect(Collectors.counting());
        System.out.println("count1 = " + count1);
        
    }
}
