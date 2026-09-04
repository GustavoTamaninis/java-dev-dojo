package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Consumidor;
import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gustavo Henrique");
        Consumidor consumidor2 = new Consumidor("Google");

        Livro livro1 = new Livro(6L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99);
        Livro livro2 = new Livro(2L, "O Hobbit", 27.90);
        Livro livro3 = new Livro(5L, "Crime e Castigo", 50D);
        Livro livro4 = new Livro(4L, "A Ilha do Tesouro", 20.80);
        Livro livro5 = new Livro(1L, "Ortodoxia", 25.50);

        List<Livro> livroConsumidor1List = List.of(livro1, livro2, livro3);
        List<Livro> livroConsumidor2List = List.of(livro4, livro5);

        Map<Consumidor, List<Livro>> consumidorLivroMap = new HashMap<>();
        consumidorLivroMap.put(consumidor1, livroConsumidor1List);
        consumidorLivroMap.put(consumidor2, livroConsumidor2List);

        for(Map.Entry<Consumidor, List<Livro>> entry : consumidorLivroMap.entrySet()){
            System.out.println("--- " + entry.getKey().getNome());
            for (Livro livro : entry.getValue()) {
                System.out.println("------ " + livro.getNome());
            }

        }
    }
}
