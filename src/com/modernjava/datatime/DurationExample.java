package com.modernjava.datatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        // duration between 2 localDateTime instances
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime,localDateTime1);
        System.out.println("duration.toHours() = " + duration.toHours());

        duration = Duration.ofHours(3);
        System.out.println("duration.toMinutes() = " + duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusMinutes(180);
        duration = Duration.between(localTime,localTime1);
        System.out.println("duration = " + duration.toHours());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(108);
        duration = Duration.between(localDate,localDate1);
        System.out.println("duration = " + duration); // This will throw Error reason below
        /*
        * Duration can be checked where we have time , where seconds are provided
        * Duration cannot be checked with date instances
        * */
    }
}
