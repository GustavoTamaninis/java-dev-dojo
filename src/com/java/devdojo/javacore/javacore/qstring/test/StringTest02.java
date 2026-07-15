package com.java.devdojo.javacore.javacore.qstring.test;

public class StringTest02 {
    static void main(String[] args) {
        String name = "Aragorn";
        int[] nums = {1, 2, 3};

//        System.out.println(name.charAt(3));

        System.out.println(nums.length); // atribute
        System.out.println(name.length()); // method

        System.out.println(name.replace("r", "l"));

        String numbers = "012345";
        System.out.println(numbers.substring(1, 3)); // Esse segundo argumento é ele menos 1... vai entender.
        // se não passar o segundo argumento, vai contar da posição do primeiro argumento até o fim da string.

        String email = "    gustavo@gmail.com  ";
        System.out.println(email.trim());
    }
}
