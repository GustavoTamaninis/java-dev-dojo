package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now, nowAfterTwoYears); // não aceita LocalDateTime, mas só LocalDate.
        Period p2 = Period.ofWeeks(3);
        Period p3 = Period.ofMonths(3);
        Period p4 = Period.ofDays(63);

        System.out.println(p1);
        System.out.println(p2); // não imprime semanas, mas dias.
        System.out.println(p3);

        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.MONTHS));
        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.WEEKS));
    }

}
