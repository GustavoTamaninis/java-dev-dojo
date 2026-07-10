package com.java.devdojo.javacore.javacore.oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    // Checked Exceptions:
    static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("file/test01.txt"); //no windows seria "\\"
        try{
            // pra tratar qualquer problema que não seja Runtime, devo escrever um código:
            boolean isCreated = file.createNewFile();
            System.out.println("File created " + isCreated);
        } catch (IOException e) { // Evite colocar lógica/regra de negócio no catch. Se estiver, é um péssimo código.
            e.printStackTrace(); // Isso, hoje em dia, não é uma boa prática. Utilize SLF4J com Logback ou Log4j2.
        }
    }
}
