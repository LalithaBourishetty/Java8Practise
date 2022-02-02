package com.modernjava.functionalprogramming;

import java.util.function.Supplier;

// Supplier interface can also be thought as factory interface
//Supplier interface is a functional interface it does not take any parameter and returns one value
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->(int) (Math.random()*1000);
        System.out.println(supplier.get());
    }

}
