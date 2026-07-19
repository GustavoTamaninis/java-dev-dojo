package com.java.devdojo.javacore.javacore.vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    static void main(String[] args) {
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/files/file01.txt");
        // exige que o objeto tenha sido criado na execução de FileWriterTest01
        try(FileReader fr = new FileReader(file)){
//            System.out.println(fr.read()); // lê o ascii do primeiro caractere.
//            char[] in = new char[30]; // in -> input. Devo escolher a quantidade de informações que vou querer ler.
//            fr.read(in); // É como um buffer em memória. Vai chamar o array e armazenar o valor nele:
//            for (char c : in){
//                System.out.print(c);
//            }

            // Para ler o arquivo inteiro:
            int aux = 0;
            while((aux = fr.read()) != -1){ // -1 porque o read() retorna -1 quando termina sua leitura.
                System.out.print((char) aux); // o aux retorna um ASCII, por isso o typecasting.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
