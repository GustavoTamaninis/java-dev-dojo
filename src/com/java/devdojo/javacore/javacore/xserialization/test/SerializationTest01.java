package com.java.devdojo.javacore.javacore.xserialization.test;

import com.java.devdojo.javacore.javacore.xserialization.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    static void main(String[] args) {
        Aluno aluno01 = new Aluno(1, "Gustavo", "12345");
        serializar(aluno01);
        desserializar();
    }

    // salvar o estado do objeto:
    private static void serializar(Aluno aluno){
        // Transformar o objeto em um array de bytes, baixo nível. Ou seja, utilizo uma classe stream:
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/xserialization/files/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) { // lembre-se que se usa recursos do OS, deve-se fechá-lo.
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace(); // Para não gerar uma exceção, é necessário que a classe implemente a interface Seriazible.
        }
    }

    // desserealizar o objeto:
    private static void desserializar(){
        Path path = Paths.get("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/xserialization/files/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno.toString());
        } catch (IOException | ClassNotFoundException e) { // o pipe, aqui, não é um operador boolean, mas um separador de tipos, um multi-catch
            e.printStackTrace();
        }
    }
    // Quando se lê um objeto serializado, o Java não lê o construtor.
    // Com herança isso pode ser problemático.
}
