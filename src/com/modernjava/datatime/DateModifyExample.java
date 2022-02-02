package com.modernjava.datatime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        //4 days from now
        //localDate is immutable when we  localDate.plusDays(4) it creates a new LocalDate obj it wont effect the exisitng
        // localdate value to change the exisitng value assign it like localDate=localDate.plusDays(4);
        System.out.println("localDate.plusDays(4) = " + localDate.plusDays(4));
        System.out.println("localDate = " + localDate);

        System.out.println("localDate.plusMonths(2) = " + localDate.plusMonths(2));
        System.out.println("localDate.plusYears(4) = " + localDate.plusYears(4));
        //to decrease 
        System.out.println("localDate.minusDays(10) = " + localDate.minusDays(10));
        //with year, month day
        System.out.println("localDate.withYear(2023) = " + localDate.withYear(2023));
        
        //
        System.out.println("localDate.with(ChronoField) = "
                + localDate.with(ChronoField.YEAR,2023));
        //
        System.out.println("localDate.with(TemporalAdjuster) = "
                + localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
