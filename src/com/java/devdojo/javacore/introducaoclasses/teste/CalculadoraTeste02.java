package com.java.devdojo.javacore.introducaoclasses.teste;

import com.java.devdojo.javacore.introducaoclasses.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int[] nums = {2, 3, 5, 7, 11};
        calculadora.somaArray(nums);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
