package com.modernjava.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAllInstructors();
        // all instructors who teaches online
       // Predicate<Instructor> p1 = (x)->x.isOnlineCourses()==true;
        //instructor exp. is >10
        //Predicate<Instructor> p2=(x) -> x.getYearsOfExperience()>10;

        //BiPredicate
        BiPredicate<Boolean,Integer> p3=(online,experience) -> online==true && experience>10;

        //BiConsumer print name and course
        BiConsumer<String,List<String>> biConsumer = (name, courses)->
                System.out.println("name is : "+name+" courses :"+courses);

        instructors.forEach(instructor -> {
            if(p3.test(instructor.isOnlineCourses(),instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(),instructor.getCourses());
        });


    }
}
