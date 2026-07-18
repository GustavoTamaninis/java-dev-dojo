package com.java.devdojo.javacore.javacore.sformatting.test;

import com.java.devdojo.javacore.javacore.gassociacao.exercise.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        // format  =>  passar de objeto para string
        // parse   =>  string para objeto

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // o "padrão"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----------------------------------------");
        LocalDate parse1 = LocalDate.parse("20260913", DateTimeFormatter.BASIC_ISO_DATE); // escolher o padrão que bate com a string.
        LocalDate parse2 = LocalDate.parse("2026-09-13+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-09-13", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-07-18T09:12:30.447210454", DateTimeFormatter.ISO_DATE_TIME); // neste caso o segundo argumento é opcional.
        System.out.println(parse4);

        // Padrões:
        System.out.println("----------------------------------------");
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String formatBR = LocalDate.now().format(formatterBR);
        String formatUS = LocalDate.now().format(formatterUS);
        String formatJP = LocalDate.now().format(formatterJP);

        System.out.println("Data no Brasil: " + formatBR);
        System.out.println("Data nos EUA: " + formatUS);
        System.out.println("Data no Japão: " + formatJP);


        LocalDate parseBR = LocalDate.parse("19/01/2021", formatterBR);
        System.out.println("Data no Brasil (parse): " + parseBR);


        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println("Data na Alemanha: " + formatGR);

        LocalDate parseGR = LocalDate.parse("18.Juli.2026", formatterGR);
        System.out.println("Data na Alemanha (parse): " + parseGR);
    }
}
