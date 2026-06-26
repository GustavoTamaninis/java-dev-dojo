package com.java.devdojo.sobrecargametodos.teste;

import com.java.devdojo.sobrecargametodos.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args){
        Livro livro = new Livro();
        //muito melhor do que usar vários sets:
        livro.init("Ortodoxia", "Filosofia", 300);
        livro.imprime();
    }
}
