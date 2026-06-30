package com.java.devdojo.javacore.introducaoclasses.fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; //pertence à classe Carro e não à instância deste. É tipo um metadado:
    // ao utilizar o "this", sempre faço referência ao objeto. E, bem, o atributo/méthodo static é um "metadado" da
    // classe no objeto.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite); // Neste caso, o "this" equivale a "Carro.",
        // pois esse atributo é um static. Posso usar qualquer um dos dois.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

//    public double getVelocidadeLimite() {
//        return velocidadeLimite;
//    }
//
//    public void setVelocidadeLimite(double velocidadeLimite) {
//        this.velocidadeLimite = velocidadeLimite;
//    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite; // ou "Carro.velocidadeLimite".
    }

    //Métodos estáticos devem ser usados quando 1. Não acesso as variáveis da instância (as não estáticas).
    public static void setVelocidadeLimite(double velocidadeLimite){
        //this.velocidadeLimite = velocidadeLimite; //não pode ser acessado porque este méthodo pode ser utilizado sem
        // ter um objeto em memória, e portanto não posso usar o this, por conta dessa possibilidade.
        Carro.velocidadeLimite = velocidadeLimite; //assim é possível.
        //Também não é possível acessar nenhuma variável não estática dentro de um méthodo estático.
        //Não poderia, por exemplo, imprimir "nome" e muito menos utilizar "this.nome" kkkkk.
    }
}
