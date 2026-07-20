package com.java.devdojo.javacore.javacore.vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    static void main(String[] args) {
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/files/file01.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) { // dá pra passar o size também: parece ser útil com arquivos grandes
            bw.write("Louvado seja Nosso Senhor Jesus Cristo! Para sempre seja louvado! E salve Maria!"); // ao invés disso ser escrito diretamente no arquivo (no disco), é armazenado num buffer.
            // Cuidado com o \n. Prefira usar newLine(), que usa o lineSeparator do OS:
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
