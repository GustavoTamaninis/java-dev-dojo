package com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.test;

import com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain.Seminario;

import java.util.Scanner;

public class AssociacaoTest {
    static void main(String[] args) {
        System.out.println("Digite o título do seminário:");
        Scanner in = new Scanner(System.in);
        Seminario seminario = new Seminario("A Descoberta do Brasil");
        seminario.imprime();
    }
}
