package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        // print out the name of the instrucor who has the highest years of experience
        Optional instructor = Instructors.getAllInstructors().stream() // below logic can be re-written using terenary operator
               // .reduce((s1,s2)->s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s1:s2);
                .reduce((s1,s2) -> {
                    if(s1.getYearsOfExperience() > s2.getYearsOfExperience())
                        return s1;
                    else
                        return s2;
                });
        if (instructor.isPresent())
        System.out.println(instructor.get());
    }
}
