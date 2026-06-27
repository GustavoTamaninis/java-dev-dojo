package com.java.devdojo.javacore.introducaoclasses.construtor.teste;

import com.java.devdojo.javacore.introducaoclasses.construtor.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args){
        Livro livro = new Livro("Padre Brown", "Kindle", 330, "Policial", "Harper Collins"); //this method represents the constructor.
        //Livro livro2 = new Livro(); //It will call the second constructor, performing an overload.
        //Muito melhor do que usar vários sets:
//        livro.init("Ortodoxia", "Físico", 300);
//        livro.init("Padre Brown", 300, "Policial");
        livro.imprime();
    }
}
