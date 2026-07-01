package com.java.devdojo.javacore.introducaoclasses.gassociacao.test;

import com.java.devdojo.javacore.introducaoclasses.gassociacao.domain.Jogador;
import com.java.devdojo.javacore.introducaoclasses.gassociacao.domain.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Paquetá");
        Time time = new Time("Flamengo");

        System.out.println("--------\nInformações do jogador:");
        jogador1.imprime();

        jogador1.setTime(time);    //criando a relação entre o jogador e o time.

        System.out.println("--------\nInformações do jogador:");
        jogador1.imprime();
    }
}
