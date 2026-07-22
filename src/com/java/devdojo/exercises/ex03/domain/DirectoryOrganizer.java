package com.java.devdojo.exercises.ex03.domain;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryOrganizer {
    private Path dir;

    public DirectoryOrganizer(Path dir){
        this.dir = dir;
    }

    public void organize() throws IOException {
        Path imgPath = this.dir.resolve("imagens");
        Path pdfsPath = this.dir.resolve("pdfs");
        Path othersPath = this.dir.resolve("outros");

        manageDirectories(imgPath, "imagens");
        manageDirectories(pdfsPath, "pdfs");
        manageDirectories(othersPath, "outros");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(this.dir);) {
            for(Path path : stream){
                if(Files.isDirectory(path)) continue;

                String fileName = path.getFileName().toString().toLowerCase();

                if (fileName.endsWith(".png") || fileName.endsWith(".jpg")) {
                    moveTo(path, imgPath, "imagens");
                } else if (fileName.endsWith(".pdf")) {
                    moveTo(path, pdfsPath, "pdfs");
                } else {
                    moveTo(path, othersPath, "outros");
                }
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    private void manageDirectories(Path dirPath, String dirName) throws IOException {
        if(Files.notExists(dirPath)) {
            System.out.println("A pasta " + dirPath.getFileName() + " não existe");
            Files.createDirectories(dirPath);
            System.out.println("Pasta " + dirName + "/ criada");
        }
    }

    private void moveTo(Path source, Path target, String folderName) throws IOException {
        Files.move(source, target.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("A imagem " + source.getFileName() + " foi armazenada na pasta" + folderName + "/");
    }

    public Path getDir() {
        return dir;
    }

    public void setDir(Path dir) {
        this.dir = dir;
    }
}
