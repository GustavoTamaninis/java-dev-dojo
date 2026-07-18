package com.java.devdojo.javacore.javacore.rdates.test;

import com.java.devdojo.javacore.javacore.gassociacao.exercise.domain.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest1 {
    static void main(String[] args) {
        Map<String, String> shortsIds = ZoneId.SHORT_IDS;
        System.out.println(shortsIds); // todas as zonas que o Java oferece suporte.
        System.out.println(ZoneId.systemDefault()); // a zona do meu OS.

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime); // diz que a zona é de tokyo, mas imprime o horário daqui

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2); // já traz o horário nessa timezone

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
//        System.out.println(offsetManaus);
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3); // desta vez trouxe não somente a zona, mas o horário em Manaus mesmo.

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate.from(meijiEraLocalDate);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
