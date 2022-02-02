package com.modernjava.java8interface;

//Prior to java8 all interface methods are public and abstract by default
//abstract method declared without any implementation for these methods implementation will be provided by
//the classes which are implementing the interface
//if we make any changes to the interface all the classes implementing interface has to be modified
//java8 allows interfaces to have default and static methods
//default methods introduced in java8 to add new methods in the existing interfaces in such a
//way so that they are backward compatible
//static methods in interfaces are similar to the default methods except that we cannot overridde these
//in the classes that override these interfaces

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike,Sid","John","Gene","Rajeev");
       // Collections.sort(names);
        //System.out.println("names = " + names);
        //we can also sort by using default method of List interface
        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);
    }
}
