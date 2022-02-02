package com.modernjava.java8interface;

public class MathOperationsExample implements Calculator{
    public static void main(String[] args) {
        MathOperationsExample example = new MathOperationsExample();
        System.out.println("Sum : "+example.sum(3,6));
        System.out.println("Divide : "+example.divide(9,3));

        //implementation for sum method using lambda expression
        Calculator calculator=(num1,num2) -> num1%num2;
        System.out.println("Calculator override sum method using lambda "+calculator.sum(3,2));

        System.out.println("Subtract: "+example.subtract(9,3));
        System.out.println("Multiply: "+Calculator.multiply(3,9));//interface static method cannot be invoked over implemented class object
        //we have to use interface name to call static method
    }
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}
