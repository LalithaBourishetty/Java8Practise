package com.modernjava.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimetoLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());
        System.out.println("localDateTime.toLocalTime() = " + localDateTime.toLocalTime());
        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime = " + localDateTime);
    }
}
