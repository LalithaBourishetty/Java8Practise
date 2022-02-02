package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of exp. between instructors
        int result = Instructors.getAllInstructors().stream()
                .filter(i->i.isOnlineCourses())
                .map(i->i.getYearsOfExperience())
                .reduce(0,(a,b)->a+b); // replaced as .reduce(0,Integer::sum);
        System.out.println(result);
    }
}
