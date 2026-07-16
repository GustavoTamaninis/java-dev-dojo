package com.java.devdojo.javacore.javacore.sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main(String[] args) {
        // pt-BR (ISO 639 pra língua e 3166-alpha2 para país)
        Locale localeItaly = new Locale("it", "IT"); // Italian - Italy
        Locale localeCH = new Locale("it", "ch"); // Italian - Switzerland
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println(localeItaly.getDisplayCountry(localeItaly) + ": " + df1.format(calendar.getTime()));
        System.out.println("Switzerland " + df2.format(calendar.getTime()));
        System.out.println(localeIndia.getDisplayCountry() + ": " + df3.format(calendar.getTime()));
        System.out.println(localeJapan.getDisplayCountry(localeJapan) + ": " + df4.format(calendar.getTime()));
        System.out.println(localeNetherlands.getDisplayCountry() + ": " + df5.format(calendar.getTime()));
    }
}
