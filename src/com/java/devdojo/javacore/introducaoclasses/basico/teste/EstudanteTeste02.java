package com.java.devdojo.javacore.introducaoclasses.basico.teste;

import com.java.devdojo.javacore.introducaoclasses.basico.dominio.Estudante;
//import com.java.devdojo.javacore.introducaoclasses.basico.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args){
//        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gustavo";
        estudante01.idade = 21;
//        impressora.imprime(estudante01); //passando a referência ao objeto e não uma cópia.
        estudante01.imprime();

        estudante02.nome = "Bruno";
        estudante02.idade = 25;
//        impressora.imprime(estudante02);
        estudante02.imprime();

        System.out.println("-------------------");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
    }
}
