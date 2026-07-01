package com.java.devdojo.javacore.introducaoclasses.basico.teste;

import com.java.devdojo.javacore.introducaoclasses.basico.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Geovane";
        funcionario.idade = 23;
        funcionario.salarios[0] = 2200.34;
        funcionario.salarios[1] = 2200.12;
        funcionario.salarios[2] = 3000;

        funcionario.imprime();
        funcionario.calcularMediaSalarial();
    }
}
