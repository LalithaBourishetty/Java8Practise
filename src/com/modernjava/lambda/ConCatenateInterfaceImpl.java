package com.modernjava.lambda;

public class ConCatenateInterfaceImpl {
    public static void main(String[] args) {
        ConCatenateInterface catenateInterface=(firstValue,secondValue)->  firstValue+" "+secondValue;
        System.out.println("Lambda implementation "+catenateInterface.concatenate("Welcome To","Java8"));
    }
}
