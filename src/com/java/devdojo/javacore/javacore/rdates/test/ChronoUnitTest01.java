package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 2, 9);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Se passaram " + ChronoUnit.HOURS.between(aniversario, now) + " horas");
        System.out.println("Se passaram " + ChronoUnit.DAYS.between(aniversario, now) + " dias");
        System.out.println("Se passaram " + ChronoUnit.WEEKS.between(aniversario, now) + " semanas");
        System.out.println("Se passaram " + ChronoUnit.MONTHS.between(aniversario, now) + " meses");
        System.out.println("E se passaram " + ChronoUnit.YEARS.between(aniversario, now) + " anos");
    }
}
