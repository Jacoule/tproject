package org.example.jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2023, 11, 5, 19, 42, 01);
        System.out.println(of);

        LocalDate localDate = of.toLocalDate();
        LocalTime localTime = of.toLocalTime();
        LocalDateTime of1 = LocalDateTime.of(localDate, localTime);
        System.out.println(of1);
    }
}
