package com.java.devdojo.javacore.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    // Retorna a posição em que devo inserir caso não haja o elemento:
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(0);
        // (-(ponto de inserção) - 1) isso é importante porque buscar pelo valor 0 nessa lista e descobrir a posição de inserção do -1, ambos retornam 0.

        Collections.sort(numeros); // A lista deve estar ordenada.
        System.out.println(Collections.binarySearch(numeros, 3)); // retorna o índice do elemento.
        System.out.println(Collections.binarySearch(numeros, 1)); // retorna o ponto de inserção.
    }
}
