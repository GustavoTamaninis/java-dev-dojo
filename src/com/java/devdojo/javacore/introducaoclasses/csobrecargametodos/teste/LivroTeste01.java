package com.java.devdojo.javacore.introducaoclasses.csobrecargametodos.teste;

import com.java.devdojo.javacore.introducaoclasses.csobrecargametodos.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args){
        Livro livro = new Livro();
        //Muito melhor do que usar vários sets:
        livro.init("Ortodoxia", "Físico", 300);
        livro.init("Padre Brown", 300, "Policial");
        livro.imprime();
    }
}
