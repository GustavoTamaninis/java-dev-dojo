package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        // implementando uma regra de negócio em que devo saber o próximo dia útil (seg a qui neste caso):
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1; break;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 { // nas regras do Java, caso haja uma classe pública, ela deve ter o nome do arquivo.
    static void main(String[] args) {
        System.out.println("--------------------------------");
        LocalDate now = LocalDate.now();
        System.out.println("Hoje é dia " + now + ", " + now.getDayOfWeek());

        now = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println("O próximo dia útil será em " + now + ", " + now.getDayOfWeek());

        System.out.println("--------------------------------");

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Amanhã será o dia " + tomorrow + ", " + tomorrow.getDayOfWeek());

        tomorrow = LocalDate.now().plusDays(1).with(new obterProximoDiaUtil());
        System.out.println("Amanhã o próximo dia útil será em " + now + ", " + now.getDayOfWeek());

//        tomorrow = LocalDate.now().with(new obterProximoDiaUtil());
//        System.out.println("O próximo dia útil será em " + tomorrow + ", " + tomorrow.getDayOfWeek());
    }
}
