package com.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.function.*;

// BinaryOperator is a functional interface it extends BiFunction
// it takes two parameters of same type and returns single value of same type
// It is useful while doing operations like add/sub/multiply/subtrction of two numbers of same type
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b)-> a+b;
        System.out.println(binaryOperator.apply(3,6));


        Comparator<Integer> comparator=(a,b) -> a.compareTo(b);

        // will calculate max of numbers using maxby
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(36,69));

        BinaryOperator<Integer> minBi =BinaryOperator.minBy(comparator);
        System.out.println(minBi.apply(69,36));

        IntBinaryOperator intBinaryOperator = (a,b) -> a*b;
        System.out.println(intBinaryOperator.applyAsInt(3,6));

        LongBinaryOperator longBinaryOperator = (a,b) -> a*b;
        System.out.println(longBinaryOperator.applyAsLong(6,9));

        DoubleBinaryOperator doubleUnaryOperator = (a, b)-> a/b;
        System.out.println(doubleUnaryOperator.applyAsDouble(6,9));
    }
}
