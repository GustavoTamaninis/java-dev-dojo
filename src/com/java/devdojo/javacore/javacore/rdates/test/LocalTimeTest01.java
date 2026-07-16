package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime time = LocalTime.of(19, 32, 15);
        LocalTime agora = LocalTime.now();

        System.out.println(time);
        System.out.println(agora);

        System.out.println(agora.getSecond());
        System.out.println(agora.get(ChronoField.SECOND_OF_DAY));
        System.out.println(LocalTime.MAX);
    }
}
