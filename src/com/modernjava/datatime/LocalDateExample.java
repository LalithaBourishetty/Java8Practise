package com.modernjava.datatime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        //creating localDate
        LocalDate localdate = LocalDate.now(); // it gives the date of the computer where this program is running
        System.out.println("localdate = " + localdate);

        //using dau of the year
        localdate = LocalDate.ofYearDay(2018,35);
        System.out.println("localdate = " + localdate);

        localdate = LocalDate.of(2018,07,04);
        System.out.println("localdate = " + localdate);

        localdate = LocalDate.now();
        //Get Methods
        System.out.println("localdate.getMonth() = "+localdate.getMonth());
        System.out.println("localdate.getMonthValue() = "+localdate.getMonthValue());
        System.out.println("localdate.getDayOfWeek() = " + localdate.getDayOfWeek());
        System.out.println("localdate.getDayOfYear() = " + localdate.getDayOfYear());
        System.out.println("localdate.get(ChronoField.MONTH_OF_YEAR) = " + localdate.get(ChronoField.MONTH_OF_YEAR));
    }
}
