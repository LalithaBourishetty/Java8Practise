package com.modernjava.streams;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//distinct : method to filet or collect distinct elements
//count :  returns the count of elements in the stream
//sorted: elements in the stream sorted according to natural order
//anyMatch: returns whether any elements of this stream match the provided predicate
//allMatch: returns whether all elements of this stream match the provided predicate
//nonMatch: returns whether no element of this stream match provided predicate
public class SteamsOperations {
    public static void main(String[] args) {

        //count
        long countOfCourses = Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)// strings - >strings.stream()
                .count();
        System.out.println(countOfCourses);
        //distinct
        long countOfDistinctCourses = Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .distinct()
                .count();

        //Distinct list
        List<String> distinctCourse= Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .distinct().collect(Collectors.toList());
        System.out.println(distinctCourse);

        //sorted
        List<String> distinctCourseSorted= Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(distinctCourseSorted);

        //anymatch
        Predicate<String> p1 = p->p.startsWith("J");
        boolean anyMatchCourse= Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .anyMatch(p1);
        System.out.println(anyMatchCourse);

        //allmatch returns true if all of the courses in the list stat with "J"
        boolean allMatchCourse= Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .allMatch(s->s.startsWith("J"));
        System.out.println(allMatchCourse);

        //noneMatch returns true if none of the courses in the list stat with "J"
        boolean noneMatchCourse= Instructors.getAllInstructors().stream()
                .map(i->i.getCourses())
                .flatMap(List::stream)
                .noneMatch(s->s.startsWith("J"));
        System.out.println(noneMatchCourse);

    }
}
