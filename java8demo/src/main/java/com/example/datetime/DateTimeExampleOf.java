package com.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExampleOf {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 5, 12);
        System.out.println(date);

        LocalTime time = LocalTime.of(15,30, 45);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2023, 5, 12, 15, 30, 45, 123456789);
        System.out.println(dateTime);
    }
}
