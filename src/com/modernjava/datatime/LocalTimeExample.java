package com.modernjava.datatime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
    public static void main(String[] args) {
        //LocalTime is immutable
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        localTime = LocalTime.of(15,18);
        System.out.println("localTime = " + localTime);
        localTime = LocalTime.of(15,18,22);
        System.out.println("localTime = " + localTime);
        localTime = LocalTime.of(15,18,23,222222369);
        System.out.println("localTime = " + localTime);

        //get
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());
        
        //Chronofield
        System.out.println("localTime.get(ChronoField.SECOND_OF_DAY) = "
                + localTime.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.get(ChronoField.MINUTE_OF_DAY) = "
                + localTime.get(ChronoField.MINUTE_OF_DAY));
    }
}
