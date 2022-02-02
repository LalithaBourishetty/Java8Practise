package com.modernjava.functionalprogramming;

import com.modernjava.functionalinterface.Instructor;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
        public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);

}
