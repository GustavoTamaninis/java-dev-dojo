package com.java.devdojo.javacore.introducaoclasses.dominio;

public class Calculadora {
    public double somaDoisNumeros(double num1, double num2){
        return num1 + num2;
    }
    public double subtraiDoisNumeros(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicaDoisNumeros(double num1, double num2){
        return num1 * num2;
    }
    public double dividirDoisNumeros(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        System.out.println("Não existe divisão por zero.");
        return 0;
    }

    //return pra void:
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero.");
            return; //dessa forma não preciso de um else abaixo.
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do 'alteraDoisNumeros':");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
