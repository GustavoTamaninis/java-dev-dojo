package com.java.devdojo.javacore.javacore.vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    static void main(String[] args) {
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/files/file01.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String linha;
            while((linha = br.readLine()) != null){ // diferentemente do FileReader, o BufferedReader lê a linha inteira ao invés de caractere por caractere.
                // Isso possui até um desempenho melhor.
                // E ao invés de retornar -1, retorna um null:
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
