package com.example.datetime;

import java.time.LocalDate;

public class DateTimeExampleArithmetic {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("오늘: " + d);

        d = d.plusDays(-1);
        System.out.println("어제: " + d);

        d = LocalDate.now();
        d = d.plusDays(-(d.getDayOfMonth() - 1));
        System.out.println("이달초: " + d);

        d = LocalDate.now();
        d = d.plusMonths(1);
        d = d.plusDays(-(d.getDayOfMonth() - 1));
        d = d.plusDays(-1);
        System.out.println("이달말: " + d);
    }
}
