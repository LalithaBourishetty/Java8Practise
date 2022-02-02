package com.modernjava.java8interface;

public class MultipleInheritanceDebugging implements InterfaceA,InterfaceD{
    public void sumA(int num1,int num2){
        System.out.println("MultipleInheritanceDebugging sumA"+(num1+num2));
    }

    public static void main(String[] args) {
        MultipleInheritanceDebugging example = new MultipleInheritanceDebugging();
        example.sumA(3,6);
    }
}
