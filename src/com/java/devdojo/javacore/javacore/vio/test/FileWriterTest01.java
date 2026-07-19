package com.java.devdojo.javacore.javacore.vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/files/file01.txt");
        try(FileWriter fw = new FileWriter(file, true)) { // Pondo esse booleano, o write não reescreve por cima, mas faz "append".
            // Se não colocar nos parênteses do try com recursos, devo fechar isto com close(), pois essa classe é subclasse de Closeable e, portanto, lida com recursos do OS.
            fw.write("Louvado seja Nosso Senhor Jesus Cristo! Para sempre seja louvado! E salve Maria!\n");
            // Um buffer é um espaço temporário na memória onde são guardados dados que estão sendo transferidos de um lugar para outro.
            // Ao fechar um arquivo, existe uma chance do OS não. Para evitar isso, use o flush:
            fw.flush(); // quando este méthodo acabar, o próprio java vai chamar o méthodo close()
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
