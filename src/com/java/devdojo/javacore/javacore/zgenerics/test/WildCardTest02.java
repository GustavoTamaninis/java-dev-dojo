package com.java.devdojo.javacore.javacore.zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
//        printConsulta(cachorros); // com lista, dá erro de compilação. Isso ocorre por conta do Type erasure.
    }

    private static void printConsulta(List<Animal> animais){
        for (Animal animal : animais){
            animal.consulta();
        }
        animais.add(new Cachorro()); // aqui funciona.
    }
}
