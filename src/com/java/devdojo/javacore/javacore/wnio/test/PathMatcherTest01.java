package com.java.devdojo.javacore.javacore.wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    // Foi feito para facilitar a busca por paths.
    static void main(String[] args) {
        Path path01 = Paths.get("directory/subdirectory/file.bkp");
        Path path02 = Paths.get("directory/subdirectory/file.txt");
        Path path03 = Paths.get("directory/subdirectory/file.java");

        matches(path01, "glob:*.bkp"); // Não vasculha nos diretórios
        matches(path01, "glob:**.bkp"); // Ignora tudo à esquerda de .bkp, o que importa é terminar em .bkp
        matches(path01, "glob:**/*.bkp"); // Neste, é obrigatório passar por um diretório. Portanto, não valida o arquivo na raíz.
        matches(path01, "glob:**.{bkp,txt,java}"); // É o "ou". Não pode haver espaço entre palavra e vírgula.
        matches(path01, "glob:**/????????"); // o arquivo deve ter exatamente 8 caracteres.
        matches(path01, "glob:**/file.????"); // precisa começar com file e deve terminar com 3 caracteres
    }
    private static void matches(Path path, String glob){ // glob é parecido com regex, mas simplificado.
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob); // o path é baseado no OS que estou trabalhando.
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
