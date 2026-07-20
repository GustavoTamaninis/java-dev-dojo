package com.java.devdojo.javacore.javacore.vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        // File para diretórios:
        File fileDiretorio = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/diretorio");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Diretório criado?\t\t" + isDiretorioCriado);

        // Criar um arquivo dentro do diretório:
        File fileArquivoDiretorio = new File(fileDiretorio, "file01.txt"); // diretório e arquivo.
        boolean isFileCriado = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado?\t\t\t" + isFileCriado);

        // Renomear um arquivo:
        File arquivoNewName = new File(fileDiretorio, "file01Renomeado.txt");
        boolean isArquivoRenomeado = fileArquivoDiretorio.renameTo(arquivoNewName); // sim, eu preciso passar um novo arquivo para renomear um...
        System.out.println("Arquivo renomeado?\t\t" + isArquivoRenomeado);

        // Renomear um diretório (é o mesmo processo):
        File diretorioNewName = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/diretoriorenomeado");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioNewName);
        System.out.println("Diretório renomeado?\t" + isDiretorioRenomeado);
    }
}
