package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main(String[] args) {
        // Duration trabalha com segundos, ou seja, com LocalDateTime ou LocalTime:

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration = Duration.ofDays(20); // vai retornar em horas

        System.out.println(d1); // retorna uma ISO - P (período) e T (tempo), passaram 175544 horas e 0 segundos.
        System.out.println(d2);

        // Duration só não aceita LocalDate, pois esta não possui segundos.
    }
}
