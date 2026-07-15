package com.java.devdojo.javacore.javacore.rdates.test;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        // possui muitos métodos deprecated
        Date date = new Date(1_000_000_000_000L); // date trabalha com um long representando os milissegundos desde 01/01/1970
        System.out.println(date);
        System.out.println(date.getTime()); // em milissegundos

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date currentHourPlusOne = new Date(currentDate.getTime() + 3_600_000); // a hora atual + 1 hora.
        System.out.println(currentHourPlusOne);
    }
}
