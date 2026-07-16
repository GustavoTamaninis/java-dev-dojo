package com.java.devdojo.javacore.javacore.sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy G"; // 'a'-> AM/PM; a classe ignora o que estiver entre ''.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdam 16 de July de 2026 AD"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
