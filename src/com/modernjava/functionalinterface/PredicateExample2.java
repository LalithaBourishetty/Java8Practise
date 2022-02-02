package com.modernjava.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();

        //all instructors who teaches online
        Predicate<Instructor> predicate = (x)-> x.isOnlineCourses()==true;

        //instructor exp is >10 years
        Predicate<Instructor> predicate1=(x)-> x.getYearsOfExperience()>10;

        instructors.forEach(instructor -> {
            if(predicate.test(instructor))
                System.out.println(instructor);
        });

        System.out.println("---------------------------------------------------");
        // instructor teaches online and exp. > 10 years
        instructors.forEach(instructor -> {
            if(predicate.and(predicate1).test(instructor))
                System.out.println(instructor);
        });
    }
}
