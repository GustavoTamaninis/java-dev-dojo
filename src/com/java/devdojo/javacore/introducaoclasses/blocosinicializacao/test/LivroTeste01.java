package com.java.devdojo.javacore.introducaoclasses.blocosinicializacao.test;

import com.java.devdojo.javacore.introducaoclasses.blocosinicializacao.domain.Livro;

public class LivroTeste01 {
    public static void main(String[] args) {
//        Livro livro = new Livro("Silmarillion");
        Livro livro = new Livro(); //executará duas vezes
        for (int cap : livro.getCapitulos()) {
            System.out.println("Capítulo: " + cap);
        }
    }
}
