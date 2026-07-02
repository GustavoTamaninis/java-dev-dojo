package com.java.devdojo.javacore.introducaoclasses.gassociacao.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the most advanced AI system MA AI");
        System.out.println("Ask any question and I shall reply \"yes\" or \"no\".");
        String question = in.nextLine();
        if(question.charAt(0) == ' '){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
