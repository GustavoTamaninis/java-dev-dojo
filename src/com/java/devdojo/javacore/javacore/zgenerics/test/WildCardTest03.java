package com.java.devdojo.javacore.javacore.zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest03 {
    static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animais = new ArrayList<>();
        printConsultaAnimal(animais);
//        printConsultaAnimal(cachorros);
//        printConsultaAnimal(gatos);
    }

    // Ao usar o wildcard, fica proibido adicionar outros elementos à essa lista. Tudo passado aqui é apenas para leitura.
    private static void printConsulta(List<? extends Animal> animais){ // aqui, pode-se usar "extends" com interfaces, também.
        for (Animal animal : animais){
            animal.consulta();
        }
    }

//    private static void printConsultaAnimal(List<? super Cachorro> animais) { // Pode vir uma lista de objects, animais ou cachorros
//        // Como aqui é de mais baixo (cachorro) até o mais alto, se faz pelo mais alto
//        for(Object o: animais) {
//            if(o instanceof Cachorro) System.out.println("Consultando cachorro");
//            if(o instanceof Gato) System.out.println("Consultando gato");
//        }
//    }

    private static void printConsultaAnimal(List<? super Animal> animais) { // posso passar qualquer uma das subclasses.
        animais.add(new Cachorro());
        animais.add(new Gato());
    }
}
