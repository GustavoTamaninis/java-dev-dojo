package com.java.devdojo.javacore.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// ZipOutput -> saída de um arquivo ZIP
// Stream significa que estou trabalhando com dados em baixo nível, praticamente binário
public class ZipOutputStreamTest01 {
    static void main(String[] args) {
        Path zipFile = Paths.get("files/file.zip");
        Path filesToZip = Paths.get("files/subdir01/subsubdir01");
        zip(zipFile, filesToZip);
    }
    private static void zip(Path zipFile, Path filesToZip){
        // ZipOutputStream é closeable:
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {
            // Passos: 1. Entrada de arquivos; 2. Conversão para zip; 3. Cópia
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());// Passo 1. Preparar entrada para esse arquivo.
                zipStream.putNextEntry(zipEntry); // Passo 2. colocar o arquivo no zip, mas não o seu conteúdo.
                Files.copy(file, zipStream);
                zipStream.closeEntry(); // não to fechando a stream, mas a entrada
//                System.out.println(file.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
