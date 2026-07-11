package com.java.devdojo.javacore.javacore.oexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main(String[] args) {
        // Quando preciso que algum pedaço de código seja executado indepentemente da condição que estiver dentro do try/catch
        // Em situações que se faz requisição a recursos externo, tipo DB, você tá fazendo requisição a um OS para que eu possa acessar esse recurso
        // Por exemplo, quando abro um arquivo, estou pedindo ao OS para abrir ao arquivo; quando conecto no DB, to pedindo ao sistema de gerenciamento de DB a conexão
        // No Java, a mesma coisa. Então, cada vez que requisito algum desses recursos, eu devo fechá-lo.
        // O finally é útil nesses casos.
        abreConexao();
    }

        private static String abreConexao(){
            try{
                // E se houver uma exceção no segundo sout? A próxima linha nunca vai ser executada.
                // O problema persiste e todas as vezes que tentar escrever. Em algum momento o processamento vai estourar.
                // Para isso impedir isso, existe o finally.
                System.out.println("Abrindo arquivo");
                //throw new RuntimeException();
                System.out.println("Escrevendo dados no arquivo");
                //System.out.println("Fechando o recurso liberado pelo OS");
                return "Conexão aberta.";
            }catch (Exception e){
                e.printStackTrace();
            }finally{ // É um bloco de código que SEMPRE vai ser executado. O exception ocorre depois disso (o resto do catch não).
                System.out.println("Fechando o recurso liberado pelo OS");
            }
            return null;
        }
}
