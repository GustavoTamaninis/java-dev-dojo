package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {
        // Criar um diretório:
        Path pastaPath = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files02");
        if(Files.notExists(pastaPath)){ // Caso o arquivo já exista, será lançada uma exceção, por isso o if
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        // Criar múltiplos diretórios:
        Path subPastaPath = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files02/subdiretorio");
        if(Files.notExists(subPastaPath)){
            Path subPastaDirectory = Files.createDirectories(subPastaPath);
        }

        // Criar um arquivo:
        Path filePath = Paths.get(subPastaPath.toString(), "file01.txt");
        if(Files.notExists(filePath)){
            Path filePathCriado = Files.createFile(filePath);
        }

        // Copiar um arquivo para, por exemplo, renomeá-lo:
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file01Renomeado.txt"); // ao invés do getParent(), posso  usar a subpastaDirectory
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
