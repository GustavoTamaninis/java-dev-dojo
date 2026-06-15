package com.java.devdojo.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[2][];
        //ou int[][] arrayInt2 = {{00, 01, 02}, {11, 12, 13, 14, 15}};

        //Inicializar arrays com tamanhos diferentes dentro de um array multidimensional
        arrayInt[0] = new int[]{00, 01, 02};
        arrayInt[1] = new int[]{11, 12, 13, 14, 15};
        //infelizmente tem que colocar o new int[] quando se está dentro de um array.

        for(int i = 0; i < arrayInt.length; i++){
            System.out.println("\nArray " + (i+1) + ":"); //misturei for normal com foreach, pra tirar proveito de ambos.
            for(int num: arrayInt[i]){
                System.out.println(String.format("%02d", num) + " ");
            }
        }
    }
}
