package com.modernjava.functionalinterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer=(a)-> System.out.println(a*10);
        intConsumer.accept(36);

        LongConsumer longConsumer = (x)-> System.out.println(x* 10L);
        longConsumer.accept(36L);

        DoubleConsumer doubleConsumer = (x)-> System.out.println(x*10);
        doubleConsumer.accept(36.9);
    }
}
