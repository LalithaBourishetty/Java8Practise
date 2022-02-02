package com.modernjava.functionalprogramming;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.function.Predicate;

public class ConvertMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> predicate1=ConvertMethodReferenceExample::greaterThanTenYearsOfExp;
        Instructors.getAllInstructors().forEach(instructor -> {
            if(predicate1.test(instructor))
                System.out.println(instructor);
        });
    }

    public static boolean greaterThanTenYearsOfExp(Instructor instructor){
        if(instructor.getYearsOfExperience() > 10)
            return true;
        return false;
    }
}
