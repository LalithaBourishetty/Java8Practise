package com.modernjava.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAllInstructors();
       // looping through all the instructors and printing out the values of instructor
        Consumer<Instructor> consumer = (x)-> System.out.println(x);
        instructors.forEach(consumer);

        //loop through all the instructors and only print out their name
        Consumer<Instructor> name=(x)-> System.out.println(x.getName());
        instructors.forEach(name);

        System.out.println("********name and courses *****************");
        //loop through all the instructors and print out their names and their courses
        Consumer<Instructor> course=(x)-> System.out.println(x.getCourses());
        instructors.forEach(name.andThen(course));

        //loop through all the instructors and print out their name if the years of experience is>10
        instructors.forEach(s-> {
            if(s.getYearsOfExperience()>5)
                consumer.accept(s);
        });

        System.out.println("-----------------------------------------");
        //loop through all the instructors and print out their name and years of exp.
        //if years of exp.>5 and teaches courses online
        instructors.forEach(s->{
            if(s.isOnlineCourses() && s.getYearsOfExperience()>5)
                consumer.andThen(name).accept(s);
        });

    }
}
