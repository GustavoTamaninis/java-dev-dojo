package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    static void main(String[] args) {
        // Manipulação normal de datas:
        LocalDate now = LocalDate.now(); // lembre-se que este now é imutável
//        now = now.plusDays(20);
        now = now.withDayOfMonth(31); // a diferença é que o with() só troca o que escolhi (dia, mês ou ano) e não vira o resto.
        now = now.with(ChronoField.DAY_OF_MONTH, 17);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("----------------------");

        // Manipulação normal de datas com TemporalAdjusters:
        LocalDate now2 = LocalDate.now();
        now2 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println("A próxima sexta pode ser hoje ou outro dia: " + now2 + ", " + now2.getDayOfWeek());

        now2 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("A próxima sexta deve ser em outro dia: " + now2 + ", " + now2.getDayOfWeek());

        now2 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)); // também tem previousOrSame
        System.out.println("A última sexta foi no dia: " + now2 + ", " + now2.getDayOfWeek());

        now2 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); // também tem previousOrSame
        System.out.println("O primeiro dia do mês é : " + now2 + ", " + now2.getDayOfWeek());

        now2 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear()); // também tem previousOrSame
        System.out.println("O primeiro dia do próximo ano será: " + now2 + ", " + now2.getDayOfWeek());
    }
}
