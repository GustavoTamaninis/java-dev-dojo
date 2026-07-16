package com.java.devdojo.javacore.javacore.sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main(String[] args) {
        Locale localeBR = new Locale("pt", "br");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numf = new NumberFormat[4];
        numf[0] = NumberFormat.getCurrencyInstance();
        numf[1] = NumberFormat.getCurrencyInstance(localeJP);
        numf[2] = NumberFormat.getCurrencyInstance(localeBR);
        numf[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1000.2130;
        for (NumberFormat numberFormat : numf){
//            System.out.println(numberFormat.getMaximumFractionDigits());
//            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "$1,000.2130"; // lança exceção caso não haja o cifrão, e a vírgula e o ponto corretos.
        try {
            System.out.println(numf[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
