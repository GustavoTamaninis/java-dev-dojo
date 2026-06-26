package com.java.devdojo.javacore.introducaoclasses.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Últimos 3 salários:");
        if(salarios != null) {
            for (double salario : salarios) {
                System.out.println("R$" + salario);
            }
        }
    }

    public void calcularMediaSalarial(){
        if(this.salarios == null){
            return;
        }
        double mediaSalarial = 0;
        for(double salario: salarios){
            mediaSalarial += salario;
        }
        mediaSalarial /= 3;

        System.out.println("A média salarial do " + this.nome + " foi de R$" + mediaSalarial + ".");
    }
}
