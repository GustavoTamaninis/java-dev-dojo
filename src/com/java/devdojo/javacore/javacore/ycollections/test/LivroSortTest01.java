package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator tbm faz comparação, mas a diferença é que ela tem o méthodo compare implemento ela na assinatura da classe.
// Basicamente ele permite ordenar de mais de uma forma.
class LivroByIdComparator implements Comparator<Livro> {

    @Override
    public int compare(Livro livro1, Livro livro2) {
        return livro1.getId().compareTo(livro2.getId()); // retorna -1 se menor; 0 de igual; 1 se maior.
    }
}

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

        System.out.println("Ordenado por nome através da sobrescrita de CompareTo:");
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("----------------------");

        // Com comparator:
        System.out.println("Ordenado por id através do Comparator e da sobrescrita de Compare");
//        Collections.sort(livros, new LivroByIdComparator()); // o segundo parâmetro deve ser um Comparator.
        livros.sort(new LivroByIdComparator()); // uma alternativa ao de cima.
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("----------------------");
    }
}
