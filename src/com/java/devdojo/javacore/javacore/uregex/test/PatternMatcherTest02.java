package com.java.devdojo.javacore.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";

        Pattern patternAb = Pattern.compile(regex);
        Matcher matcherAB = patternAb.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");
        while(matcherAB.find()){
            System.out.print(matcherAB.start() + " " + matcherAB.group() + "\n"); // para mostrar o que foi encontrado.
        }

        System.out.println("--------------");

        // Meta caracteres:
        // \d = dígitos. (por ser um caractere de escape, utilize \\d):
        // \D = tudo que não for dígito.
        // \s = todos os espaços em branco (\t \n \f \r)
        // \S = todo caractere que não for espaço em branco
        // \w = a-zA-Z, dígitos e _
        // \W = tudo que não for a-zA-Z, dígitos ou _
        // \
//        regex = "\\d";
//        regex = "\\D";
        regex = "\\s";
        texto = "vh09uo1" +
                "0i3d@v h8ads";
        Pattern patternNums = Pattern.compile(regex);
        Matcher matcherNums = patternNums.matcher(texto);

        System.out.println("texto:  "+ texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");
        while(matcherNums.find()){
            System.out.print("No índice " + matcherNums.start() + " foi encontrado: " + matcherNums.group() + "\n");
        }
    }
}
