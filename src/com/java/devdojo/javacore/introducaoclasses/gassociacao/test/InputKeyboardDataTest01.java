package com.java.devdojo.javacore.introducaoclasses.gassociacao.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your full name:");
        String name = input.nextLine(); //o next normal apenas retorna a primeira palavra de uma String.
        System.out.println("His/Her name is " + name);

        System.out.println("Please type your age:");
        int age = input.nextInt();
        System.out.println(name + " is " + age + " years old.");

        System.out.println("Please type M or F for your gender:");
        char gender = input.next().charAt(0); //input does not have next char, but we can do a little trick with charAt(index).
        System.out.println("Gender: " + gender);

        System.out.println("------------");

    }
}
