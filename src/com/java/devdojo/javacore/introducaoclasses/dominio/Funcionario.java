package com.java.devdojo.javacore.introducaoclasses.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Últimos 3 salários:");
        for (double salario : salarios){
            System.out.println("R$" + salario);
        }

    }

    public void calcularMediaSalarial(){
        double salarioTotal = 0;
        for(double salario: salarios){
            salarioTotal += salario;
        }
        salarioTotal /= 3;

        System.out.println("A média salarial do " + this.nome + " foi de R$" + salarioTotal + ".");
    }
}
