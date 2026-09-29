package com.java.devdojo.javacore.javacore.zgenerics.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main(String[] args) {
        // Type erasure (após a compilação, o tipo é apagado...):
        List<String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Rodrigo");

        for(String s: lista){
            System.out.println(s);
        }

        // Problemas gerados pelo type erasure:
        System.out.println("-----");
        add(lista, new Consumidor("Marcelo"));

        for(Object o: lista){
            System.out.println(o);
        }
    }

    // Errado:
    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }

    // Certo:
    private  static void add2(List<String> lista, Consumidor consumidor) {
//        lista.add(consumidor);
    }
}
