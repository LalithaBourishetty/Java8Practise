package com.modernjava.datatime;
/*
* Instant is defined as an instant in teh datetime continuum specified as a number of milliseconds
* from 1970-01-00.00.00.000000000
* it represents the start of a nanosecond on the timeline.This class is useful for generating
* a time stamp to represent machine time.
* Instant timeStamp = Instant.now();
* */

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("timestamp.getNano() = " + timestamp.getNano());

        Instant timestamp1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp1,timestamp);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(timestamp1, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
                
    }
}
