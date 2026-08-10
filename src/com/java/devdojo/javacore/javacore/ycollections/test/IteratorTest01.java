package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(6);
        livros.add(new Livro(3L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99, 0));
        livros.add(new Livro(2L, "O Hobbit", 27.90, 1));
        livros.add(new Livro(1L, "Ortodoxia", 25.50, 0));
        livros.add(new Livro(5L, "Crime e Castigo", 50D, 2));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));

        // Péssima ideia:
//        for(Livro livro : livros){
//            if(livro.getQtde() == 0){
//                livros.remove(livro); // lança um erro de ConcurrentModificationException.
//            }
//        }

        // Remoção de forma segura:
        Iterator<Livro> livroIterator = livros.iterator(); // Essa classe checa antes de realizar uma ação:
        // Se, por exemplo, ao ver uma fila no banco, vc vê se tem alguém na fila e chama ela.
        // se houver mais alguém na fila, chama ela em seguida.

//        while(livroIterator.hasNext()){ // enquanto vejo uma pessoa.
//            Livro livro = livroIterator.next();// aponto pra ela.
//            if(livro.getQtde() == 0){
//                livroIterator.remove();
//            }
//        }
//
//        System.out.println(livros);

        // No Java 8, programação funcional, foi adicionado isso:
        livros.removeIf(livro -> livro.getQtde() == 0); // 1. Variável de referência; 2. Lógica de negócio.
        System.out.println(livros);
    }
}
