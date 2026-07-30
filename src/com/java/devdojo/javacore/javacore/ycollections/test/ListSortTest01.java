package com.java.devdojo.javacore.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main(String[] args) {
        List<String> livros = new ArrayList<>(6);
        livros.add("O Senhor dos Anéis: A Sociedade do Anel");
        livros.add("O Hobbit");
        livros.add("Crime e Castigo");
        livros.add("Ortodoxia");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.02);
        dinheiros.add(23.01);
        dinheiros.add(89D);

        Collections.sort(livros);
        Collections.sort(dinheiros);

        for(String livro : livros){
            System.out.println(livro);
        }

        System.out.println(dinheiros);
    }
}
