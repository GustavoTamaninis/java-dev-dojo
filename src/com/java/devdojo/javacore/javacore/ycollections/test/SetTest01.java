package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
//        Set<Livro> livros = new HashSet<>(); // o Set não permite elementos duplicados na coleção. E não é indexado.
        Set<Livro> livros = new LinkedHashSet<>(); // Usando Hash, mantendo a ordem de inserção.
        livros.add(new Livro(3L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99, 0));
        livros.add(new Livro(2L, "O Hobbit", 27.90, 1));
        livros.add(new Livro(1L, "Ortodoxia", 25.50, 0));
        livros.add(new Livro(5L, "Crime e Castigo", 50D, 2));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0)); // é ignorado pelo Set (que usa equals). Por isso é bom o equals estar sobrecarregado.

        // O Set não é indexado: não há posições. É preciso percorrê-lo:
//        for(Livro livro : livros){
//            System.out.println(livro);
//        }
        livros.forEach(System.out::println); // alternativa
    }
}
