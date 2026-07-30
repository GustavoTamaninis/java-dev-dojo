package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "iPhone");
        Smartphone s2 = new Smartphone("333AAA", "Samsung");
        Smartphone s3 = new Smartphone("BB2231", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // consigo passar o index tbm

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

//        smartphones.clear(); //limpa o array sem perder a variável de referência:

        Smartphone s4 = new Smartphone("333AAA", "Samsung");

        System.out.println("O objeto s4 já está na lista? " + smartphones.contains(s4));
        // esse contains() está usando o nosso equals() sobrescrito.

        int indexSmartphone4 = smartphones.indexOf(s4); // traz o índice do objeto na lista ou -1 caso ele não exista.
        System.out.println("Em que posição está o objeto s4 (isso sem precisar do equals)? " + indexSmartphone4);

        Smartphone s5 = new Smartphone("CCC333", "Nokia Tijolão");
        int indexSmartphone5 = smartphones.indexOf(s5);
        System.out.println("Em que posição está o objeto s4? " + indexSmartphone5 + "... Então não está na lista.");

        // pra pegar o objeto da lista (mas não o mesmo objeto):
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
