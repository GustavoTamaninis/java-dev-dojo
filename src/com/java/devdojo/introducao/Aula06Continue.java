package com.java.devdojo.introducao;

public class Aula06Continue {
    public static void main(String [] args){
        int valorTotal = 30000;
        for(int i = valorTotal; i >= i; i--){
            int n = valorTotal / i;
            if(n < 1000) continue;
            System.out.print("O valor de i: " + i + "\nValor total: " + i + "\n");
        }
    }
}
