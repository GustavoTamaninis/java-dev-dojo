package com.java.devdojo.javacore.javacore.oexception.runtime.test;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException(); // o Java vai tentar achar essa exceção.
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Catches de array, argumento ilegal e aritmético");
        }catch (IndexOutOfBoundsException e){ // Esta também é uma opção, pois ArrayIndexOutOfBounds extende esta classe (Polimorfismo). Quem vier primeiro, será escolhido
            System.out.println("Catch do IndexOutOfBoundsException");
        }catch (RuntimeException e){ // se não capturar nenhuma das outras, cai no mais genérico.
            // Porém, o tipo genérico não pode vir antes dos outros catches, pra não serem "unreachable"
            System.out.println("Catch do RuntimeException");
        }
        // a boa prática é tratar a exceção mais específica e colocar a mais genérica depois, por garantia.

        System.out.println("Execução pós RuntimeException"); // é executado mesmo se houver exceção de runtime, desde que será capturado (catch).

        try{
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){ // Pode-se usar polimorfismo com "Exception". E não posso fazer se forem da mesma linha de herança, tipo colocar IOException.
            e.printStackTrace();
        }
    }



    // Nas checked (filhas diretas de Exception), também funciona:
    public static void talvezLanceException() throws SQLException, FileNotFoundException { // Exceptions que não são da mesma herança
        // código
    }
}
