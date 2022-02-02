package com.modernjava.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
          
        //of
        localDateTime = LocalDateTime.of(2018,1,12,12,12,12);
        System.out.println("localDateTime = " + localDateTime);
        
        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getSecond());
       //chronofield
        System.out.println("localDateTime = "
                + localDateTime.get(ChronoField.MONTH_OF_YEAR));

        System.out.println("localDateTime = "
                + localDateTime.plusYears(1));
        System.out.println("localDateTime.plusMinutes() = "
                + localDateTime.plusMinutes(31));
        System.out.println("localDateTime.plusHours(3) = " + localDateTime.plusHours(3));
        System.out.println("localDateTime.with(ChronoField.YEAR) = "
                + localDateTime.with(ChronoField.HOUR_OF_DAY,3));
        System.out.println("localDateTime.get(LocalTime.MIDNIGHT) = "
                + localDateTime.with(LocalTime.MIDNIGHT));

    }
}
