package com.java.devdojo.javacore.introducaoclasses.gassociacao.test;

import com.java.devdojo.javacore.introducaoclasses.gassociacao.domain.Jogador02;
import com.java.devdojo.javacore.introducaoclasses.gassociacao.domain.Time02;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador02 jogador1 = new Jogador02("Paquetá");
        Jogador02 jogador2 = new Jogador02("Neymar");

        Time02 time = new Time02("Brasil");

        jogador1.setTime(time);
        jogador2.setTime(time);

        Jogador02[] jogadores = {jogador1, jogador2};
        time.setJogadores(jogadores);

        System.out.println("--------\nInformações do " + time.getNome() + ":");
        time.imprime();

        System.out.println("--------\nInformações do " + jogador1.getNome() + ":");
        jogador1.imprime();

        System.out.println("--------\nInformações do " + jogador2.getNome() + ":");
        jogador2.imprime();
    }
}
