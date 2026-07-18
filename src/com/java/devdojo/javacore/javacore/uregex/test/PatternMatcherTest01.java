package com.java.devdojo.javacore.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main(String[] args) {
        String regex = "ab";
        String regex2 = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern patternAb = Pattern.compile(regex); // as expressões regulares precisam ser compiladas.
        Matcher matcher = patternAb.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");
        while(matcher.find()){ // enquanto o match encontrar o "ab"
            System.out.print(matcher.start() + " "); // start porque pega a posição do primeiro caractere, neste caso "a" está nos índices 0 e 3.
        }

        System.out.println("\n----------------------");
        Pattern patternAba2 = Pattern.compile(regex2);
        Matcher matcher2 = patternAba2.matcher(texto2);
        System.out.println("texto:  "+ texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex2);
        System.out.println("posições encontradas: ");
        while(matcher2.find()){
            System.out.print(matcher2.start() + " "); // o "aba" dos índices 2 a 4 é ignorado, pois o matcher continua no índice que segue depois do último caractere da palavra buscada
        }
    }
}
