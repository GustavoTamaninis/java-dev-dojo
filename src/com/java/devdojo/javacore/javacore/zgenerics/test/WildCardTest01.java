package com.java.devdojo.javacore.javacore.zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTest01 {
    static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animais = {new Cachorro(), new Gato()};
    }

    private static void printConsulta(Animal[] animais){
        for (Animal animal : animais){
            animal.consulta();
        }
//        animais[1] = new Gato(); // erro na execução.
    }
}
