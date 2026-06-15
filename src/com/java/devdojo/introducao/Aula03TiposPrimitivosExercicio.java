package com.java.devdojo.introducao;
/*
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu, <nome>, morando no endereço <endereço>
    confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Gustavo";
        String endereco = "Rua São Padre Pio, 499";
        String dataRecebimentoSalario = "20 de fevereiro de 2022";
        float salario = 2700.74F;
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + "\nconfirmo que recebi o salário de " +
                salario + " na data " + dataRecebimentoSalario);
    }
}
