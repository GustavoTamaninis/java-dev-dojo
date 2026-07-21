package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    // directory stream é a forma mais fácil de pegar todos os arquivos de um diretório.
    // É tipo um dir.
    static void main(String[] args) {
        Path dir = Paths.get("."); // o ponto representa o diretório atual.
        // Generics é oq o java vai decidir em tempo de compilação o tipo de classe que ele vai criar.
        // Por extender Closeable, é necessário fechá-lo.
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){ // vai associar cada um dos arquivos a um Path.
            // stream = fluxo (uma quantidade maior do que um, exigindo iteração). Pode-se dizer que é como um array.
            for (Path path : stream){
                System.out.println(path.getFileName()); // não vai acessar pastas recursivamente. Isto fica pra SimplesFileVisitor
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
