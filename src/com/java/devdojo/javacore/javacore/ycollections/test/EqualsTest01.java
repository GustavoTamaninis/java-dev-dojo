package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        //
        String nome01 = "Gustavo Henrique";
        String nome02 = new String("Gustavo Henrique");
        System.out.println(nome01 == nome02); // false, pois não comparo valores e sim a referência.
        System.out.println(nome01.equals(nome02)); // true, pois compara os valores das strings.

        Smartphone s1 = new Smartphone("1ABC3", "Iphone");
        Smartphone s2 = new Smartphone("1ABC3", "Iphone");
        System.out.println(s1.equals(s2));
        // (sem a sobrescrita de equals) false, pois os valores em memória apontados não são iguais.
        // (com a sobrescrita de equals) true.

//        s2 = s1;
//        System.out.println(s1.equals(s2)); // true, pois as duas variáveis fazem referência ao mesmo objeto.


    }
}
