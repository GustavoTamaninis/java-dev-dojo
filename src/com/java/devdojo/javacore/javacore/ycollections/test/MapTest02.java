package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Consumidor;
import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gustavo Henrique");
        Consumidor consumidor2 = new Consumidor("Google");

        Livro livro1 = new Livro(6L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99);
        Livro livro2 = new Livro(2L, "O Hobbit", 27.90);
        Livro livro3 = new Livro(5L, "Crime e Castigo", 50D);
        Livro livro4 = new Livro(4L, "A Ilha do Tesouro", 20.80);
        Livro livro5 = new Livro(1L, "Ortodoxia", 25.50);

        Map<Consumidor, Livro> consumidorLivro = new HashMap<>();
        consumidorLivro.put(consumidor1, livro1);
        consumidorLivro.put(consumidor2, livro4);

        for(Map.Entry<Consumidor, Livro> entry : consumidorLivro.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
