package com.java.devdojo.javacore.introducaoclasses.basico.teste;

import com.java.devdojo.javacore.introducaoclasses.basico.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dividirDoisNumeros(0, 0));
        calculadora.imprimeDivisaoDeDoisNumeros(12, 0);

        int number1 = 1;
        int number2 = 2;

        calculadora.alteraDoisNumeros(number1, number2);
    }
}
