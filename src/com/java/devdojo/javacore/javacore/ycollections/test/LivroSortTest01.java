package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivroSortTest01 {
    // a classe String implementa a interface Comparable, que tem um méthodo compareTo.
    static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(6);
        livros.add(new Livro(3L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99));
        livros.add(new Livro(2L, "O Hobbit", 27.90));
        livros.add(new Livro(5L, "Crime e Castigo", 50D));
        livros.add(new Livro(1L, "Ortodoxia", 25.50));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90));
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("----------------------");
        Collections.sort(livros);

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
