package com.modernjava.java8interface;
@FunctionalInterface
public interface Calculator {
    //abstract method sum
    public int sum(int num1,int num2);

    //abstract division method
    default int divide(int num1, int num2){
        return num1/num2;
    }

    //default method which is subtract
    default int subtract(int num1,int num2){
        return num1-num2;
    }
    static int multiply(int num1,int num2){
        return num1*num2;
    }

}
