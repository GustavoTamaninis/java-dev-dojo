package com.java.devdojo.javacore.javacore.basico.teste;

import com.java.devdojo.javacore.javacore.basico.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante(); //esse "estudante" é variável de referência.
        //uma vez perdida essa referência, o objeto se perde pra sempre...
        estudante.nome = "Gustavo";
        estudante.idade = 21;

        System.out.println(estudante.nome);
    }
}
