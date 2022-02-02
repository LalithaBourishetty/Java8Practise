package com.modernjava.functionalprogramming;

import com.modernjava.functionalinterface.Instructor;

import java.util.Arrays;
/*
 * Can use Contructor reference in the context of functional interface
 *
 * You cannot create an instance of class like this
 *       Instructor instructor= Instructor::new;
 *
 * You can instantiate an object like this but the interface must be functional interface
 *       InstructorFactory instructorFactory= Instructor::new;
 *
 * Inorder to use constructor reference,you need to define a Functional Interface with an abstract method whose return type is
 * same as the Object with which you intend to make a Constructor reference
 *
 * Create a class with a constructor that matches the functional interface abstract method
 * */
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Koushik",11,"Software Engineer","M",true,
                Arrays.asList("JAVA","Spring","REST API","Microservices"));

        System.out.println(instructor);
    }
}
