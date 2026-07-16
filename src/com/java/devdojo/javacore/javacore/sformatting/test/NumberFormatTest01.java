package com.java.devdojo.javacore.javacore.sformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main(String[] args) {
        Locale localeBR = new Locale("pt", "br");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numf = new NumberFormat[4];
        numf[0] = NumberFormat.getInstance();
        numf[1] = NumberFormat.getInstance(localeJP);
        numf[2] = NumberFormat.getInstance(localeBR);
        numf[3] = NumberFormat.getInstance(localeIT);

        double value = 10_000_000.2130;
        for (NumberFormat numberFormat : numf){
            System.out.println(numberFormat.format(value));
        }
    }
}
