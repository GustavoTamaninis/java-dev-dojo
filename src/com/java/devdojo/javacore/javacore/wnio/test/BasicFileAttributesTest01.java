package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    static void main(String[] args) throws IOException {
        // BasicFileAttributes é uma interface mais geral. Me permite usar polimorfismo a partir do OS
        // DosFileAttributes, que é uma implementação da interface anterior, contendo apenas métodos de leitura. É mais voltada para Windows
        // PosixFileAttributes. É voltada para Linux
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/test.txt");

        // Alterar data de modificação de um arquivo com a classe File:
        boolean isCriado = file.createNewFile();
        boolean isModificado = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        // Alterar data de modificação de um arquivo com o pacote NIO:
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/wnio/files03/test02.txt");
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));

        Files.createFile(path);
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
