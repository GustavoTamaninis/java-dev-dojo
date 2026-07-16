package com.java.devdojo.javacore.javacore.rdates.test;

import com.java.devdojo.javacore.javacore.gassociacao.exercise.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // até nanossegundos possui
        System.out.println(localDateTime.getDayOfYear());

        LocalDate date = LocalDate.of(2027, Month.AUGUST, 8);
//        LocalDate date = LocalDate.parse("2027-08-08");
        LocalTime time = LocalTime.of(9, 46, 0);
//        LocalTime time = LocalTime.parse("09:46:00");

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
