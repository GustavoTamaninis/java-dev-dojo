package com.java.devdojo.javacore.introducaoclasses.gassociacao.test;

import com.java.devdojo.javacore.introducaoclasses.gassociacao.domain.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Zico");
        Jogador jogador3 = new Jogador("Lírio");

//        Jogador[] jogadores = new jogador[3]
        Jogador[] jogadores = {jogador1, jogador2, jogador3}; // é parecido com ponteiros.

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}

/*
    Jogador 1 -- 1 Personagem
    Time 1 -- N Jogador
    Jogador N -- 1 Time
    Estudante N -- N Curso

    Dizer que os jogadores têm referência para o time, mas que o time não tem para jogadores, é unidirecional

 */
