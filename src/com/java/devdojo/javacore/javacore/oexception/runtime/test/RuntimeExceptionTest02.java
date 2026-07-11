package com.java.devdojo.javacore.javacore.oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        try{
            System.out.println(divisao(2, 0));;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado.");
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{ // it's possible too
//    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0."); // it's like a "break". I'm creating the Exception, 'cause there's no an Exception. (in the catch?)
        }
        return a/b;
    }
}
