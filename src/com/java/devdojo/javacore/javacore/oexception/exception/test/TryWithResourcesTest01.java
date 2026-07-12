package com.java.devdojo.javacore.javacore.oexception.exception.test;

import com.java.devdojo.javacore.javacore.oexception.exception.domain.Reader01;
import com.java.devdojo.javacore.javacore.oexception.exception.domain.Reader02;

import java.io.*;

// Try with resources é muito útil especialmente para Banco de Dados, porque muitas vezes o dev esquece de fechar as conexões toda hora.
public class TryWithResourcesTest01 {
    static void main(String[] args) {
        lerArquivo3();
    }

    public static void lerArquivo(){
        Reader reader = null; // não pode estar no bloco try, pois os outros devem acessá-lo
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    // Opção mais bonita:
    public static void lerArquivo2() throws IOException {
        // Só se pode colocar objetos/variáveis de referência dentro de try resources que implementem a interface Closeable ou AutoCloseable (Pai do Closeable)
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){ // esse try tá tomando conta de fechar a conexão dessa variável de referência
            new BufferedReader(new FileReader("teste.txt"));
        }  // o catch é opcional, mas precisa colocar o "throws" na assinatura do méthodo.
    }

    // Exemplo:
    public static void lerArquivo3() {
        try(Reader01 reader01 = new Reader01();
        Reader02 reader02 = new Reader02()){ // Posso declará-las juntas, mas preciso que elas implementem a interface Closeable ou AutoCloseable
            // 1. O java foi responsável por chamar o close
            // 2. Eles foram chamados na ordem inversa do que foram declarados.
            // se conectar 1, 2 e 3, vai fechar 3, 2, 1.
        }catch (IOException e){

        }
    }

}
