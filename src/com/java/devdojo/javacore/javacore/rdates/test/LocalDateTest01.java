package com.java.devdojo.javacore.javacore.rdates.test;

import com.java.devdojo.javacore.javacore.gassociacao.exercise.domain.Local;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main(String[] args) {
        System.out.println("Date :" + new Date());
        System.out.println("Calendar: " + Calendar.getInstance());

        LocalDate date = LocalDate.of(2026, Month.JULY, 16);// só trabalha com datas, e não com horas.
        System.out.println("\nLocalDate: " + date);
        System.out.println(date.getYear() + 2);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println("É ano bissexto? " + date.isLeapYear());

        System.out.println(date.get(ChronoField.YEAR));

        System.out.println(date); // A data é salva igual ao banco de dados

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

//        agora.plusYears(2); // é imutável, então cria outro objeto
        System.out.println(agora.plusYears(2));

        System.out.println(LocalDate.MIN); // não é mais dos anos 70
        System.out.println(LocalDate.MAX);
    }
}
