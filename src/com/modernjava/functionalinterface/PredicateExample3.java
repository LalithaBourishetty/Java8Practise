package com.modernjava.functionalinterface;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1=(x) -> x>100;
        System.out.println(p1.test(369));

        LongPredicate p2=(x) -> x>100L;
        System.out.println(p2.test(111111111111L));

        DoublePredicate p3=(x) -> x<100.25;
        DoublePredicate p4 = (x)-> x>100.10;
        System.out.println(p3.and(p4).test(100.15));

    }
}
