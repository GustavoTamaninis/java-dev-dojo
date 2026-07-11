package com.java.devdojo.javacore.javacore.oexception.runtime.test;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException(); // o Java vai tentar achar essa exceção.
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){ // Esta também é uma opção, pois ArrayIndexOutOfBounds extende esta classe (Polimorfismo). Quem vier primeiro, será escolhido
            System.out.println("Catch do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Catch do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Catch do ArithmeticException");
        }catch (RuntimeException e){ // se não capturar nenhuma das outras, cai no mais genérico.
            // Porém, o tipo genérico não pode vir antes dos outros catches, pra não serem "unreachable"
            System.out.println("Catch do RuntimeException");
        }
        // a boa prática é tratar a exceção mais específica e colocar a mais genérica depois, por garantia.

        System.out.println("Execução pós RuntimeException"); // é executado mesmo se houver exceção de runtime, desde que será capturado (catch).

        try{
            talvezLanceException();
        }catch (SQLException e){
            // código
        }catch (FileNotFoundException e){ // Pode-se usar polimorfismo com IOException. Ou com Exception num único catch.
            // código
        }
    }



    // Nas checked (filhas diretas de Exception), também funciona:
    public static void talvezLanceException() throws SQLException, FileNotFoundException { // Exceptions que não são da mesma herança
        // código
    }
}
