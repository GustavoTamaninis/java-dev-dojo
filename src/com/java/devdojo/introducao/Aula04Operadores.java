package com.java.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        //Operadores Relacionais "<", ">", "<=", ">=", "==", "!= sempre retornam valores booleanos:
        boolean isDezMaiorQueVinte = 10 > 20; //o padrão no java para nomear variáveis do tipo boolean é usar o "is"
        System.out.println(isDezMaiorQueVinte);
        boolean isDezDiferenteDeDez = 10 != 10.0; //comparar número com String não dá
        System.out.println(isDezDiferenteDeDez);

        //Operadores lógicos "&&", "||", "!"

        //Valores de atribuição "=", "+=", "-=", "*=", "/=", "%"
        //Operador ternário: String padraoDeVida = salario > 5000 ? "Rico" : "Pobre";
    }
}
