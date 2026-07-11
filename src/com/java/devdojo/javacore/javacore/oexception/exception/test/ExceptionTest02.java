package com.java.devdojo.javacore.javacore.oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    // Checked Exceptions:
    static void main(String[] args) throws IOException{ // jogando a responsabilidade pra quem tá chamando, obrigando-o a tratar o erro.
        criarNovoArquivo();
    }

    // Em métodos privados, utiliza-se o try catch.
    // Nas públicas, pode-se utilizar o "throws" na assinatura do méthodo ou o try catch. Depende muito do projeto.

    // Também existe a opção híbrida. Por exemplo, em pagamento falho: saber o que houve no console (try, catch) e dar opção ao cliente (throws):
    public static void criarNovoArquivo() throws IOException{
        File file = new File("file/test01.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("File created " + isCreated);
        }catch (IOException e){
            e.printStackTrace(); // imprime no console.
            throw e; // e relança. (Isso torna obrigatório colocar na assinatura do méthodo a exceção
            //throw new RuntimeException("Problema em criar o arquivo."); // também é possível e remove a obrigatoriedade da exceção na assinatura do méthodo e do tratamento na main
        }
    }
}
