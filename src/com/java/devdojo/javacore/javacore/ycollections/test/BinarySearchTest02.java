package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        LivroByIdComparator criterioDeBusca = new LivroByIdComparator();

        List<Livro> livros = new ArrayList<>(6);
        livros.add(new Livro(6L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99));
        livros.add(new Livro(2L, "O Hobbit", 27.90));
        livros.add(new Livro(5L, "Crime e Castigo", 50D));
        livros.add(new Livro(4L, "A Ilha do Tesouro", 20.80));
        livros.add(new Livro(1L, "Ortodoxia", 25.50));

        System.out.println("Lista ordenada por nome:");
//        Collections.sort(livros);
        livros.sort(criterioDeBusca);
        for (Livro livro: livros){
            System.out.println(livro);
        }
        System.out.println("-------------------");

        Livro livroToSearch = new Livro(5L, "Crime e Castigo", 50D);
        Livro livroToSearch2 = new Livro(3L, "História da Igreja", 43.90);
        System.out.println(Collections.binarySearch(livros, livroToSearch, criterioDeBusca));
        System.out.println(Collections.binarySearch(livros, livroToSearch2, criterioDeBusca));

//        Arrays.binarySearch() // Também é possível fazer isso com arrays:
    }
}
