package com.modernjava.datatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeToZoneDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("----------------------------------");
        //attaches zone America/New_York to local date time
        ZonedDateTime zonedDateTime = localDateTime
                .atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        //where we want to add an offset
        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-10))); // -10 added to zone offset to local date and time



    }
}
