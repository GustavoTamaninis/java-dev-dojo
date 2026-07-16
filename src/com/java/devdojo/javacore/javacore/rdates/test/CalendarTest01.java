package com.java.devdojo.javacore.javacore.rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // é uma classe abstrata, então não possa usar new

        System.out.println(c);

        Date date = c.getTime();
        System.out.println(date);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("O 1º dia da semana é Domingo, portanto você não mora na França...");
        }else if(c.getFirstDayOfWeek() == 2){
            System.out.println("Você mora na França, pois o primeiro dia da semana é Segunda-Feira");
        }

        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(c.getTime());

        c.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println(c.getTime());
    }
}
