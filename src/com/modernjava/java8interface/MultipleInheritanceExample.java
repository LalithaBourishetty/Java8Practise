package com.modernjava.java8interface;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB,InterfaceC{
    public static void main(String[] args) {
        MultipleInheritanceExample example = new MultipleInheritanceExample();
        example.sumA(3,6);
        example.sumB(6,9);
        example.sumC(3,6);
    }
 //implemented class first
 //then sub interface that extends the interface
    public void sumA(int num1, int num2) {
        System.out.println("MultipleInheritanceExample sumA "+(num1+num2));
    }
}
