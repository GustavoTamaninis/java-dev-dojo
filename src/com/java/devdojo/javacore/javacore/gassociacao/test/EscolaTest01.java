package com.java.devdojo.javacore.javacore.gassociacao.test;

import com.java.devdojo.javacore.javacore.gassociacao.domain.Escola;
import com.java.devdojo.javacore.javacore.gassociacao.domain.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        //Faz mais sentido começar a instanciar os objetos a partir daqueles que não contém outros objetos.
        Professor professor1 = new Professor("Jefferson");
        Professor professor2 = new Professor("Miranda");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Padre Valente", professores);

        escola.imprime();
    }
}
