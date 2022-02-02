package com.modernjava.functionalprogramming;

import com.modernjava.functionalinterface.Instructor;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

// method reference is a shorthand notation of lambda expression to call a method
//lambda expression str -> System.out.println(str);
//Method reference System.out::println
//There are three type of method references in java
// Reference to a static method Class::staticMethod
//Reference to instanceMethod object::instanceMethod
//Reference to constructor class::new

//Function<Integer,Double> sqrt=x->Math.sqrt(n);
//Function<Integer,Double> sqrt=
//Function<String,String> tolower = (s)->s.toLowercase();
//Function<String,String> tolower=String::toLowercase;
/*
 *can't convert below to method reference
 * (a) -> System.out.println(a*10);
 */

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1=i ->i.isOnlineCourses();
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;

        Function<Integer,Double> sqroot= s->Math.sqrt(s);
        Function<Integer,Double> sqroot1= Math::sqrt;

        Function<String,String> lowercaseFunction = s->s.toLowerCase();
        Function<String,String> lowercaseFunction1=String::toLowerCase;

        System.out.println(lowercaseFunction1.apply("Java Programming"));


    }
}
