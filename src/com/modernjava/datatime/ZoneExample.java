package com.modernjava.datatime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        System.out.println("-----------------------------------");
        System.out.println("Current time at Asia/Singapore = " + ZonedDateTime.now(ZoneId.of("Asia/Singapore")));

        System.out.println("America/Toronto : "
                +ZonedDateTime.now(ZoneId.of("America/Toronto")));
    }
}
