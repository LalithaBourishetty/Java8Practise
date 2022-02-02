package com.modernjava.lambda;

import org.w3c.dom.ls.LSOutput;

class HelloWorldImpl implements HelloWorldInterface{

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }
}
//Lamdba expression () -> {lambda implementation logic/method body};
// Provides implementations for Functional Interface
// Does not contain name and return type takes parameters and contains implementation logic
//return type determined by compiler based on the value the expression is returning
public class HelloWorldInterfaceImpl {
    public static void main(String[] args) {
        HelloWorldImpl helloWorldTraditional = new HelloWorldImpl();
        System.out.println("Traditional implementation of interface "+helloWorldTraditional.sayHelloWorld());

        //HelloWorldInterface lambdaImplementation = ()-> {return "Hello World!";};
        // we can simplify above lambda expression by removing {} and return as below:
        HelloWorldInterface lambdaImplementation = ()-> "Hello World!";

        System.out.println("Functional Interface Implementation using lambda "+lambdaImplementation.sayHelloWorld());
    }


}
