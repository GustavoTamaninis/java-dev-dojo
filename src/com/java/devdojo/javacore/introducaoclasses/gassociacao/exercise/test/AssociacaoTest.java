package com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.test;

import com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain.Aluno;
import com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain.Local;
import com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain.Professor;
import com.java.devdojo.javacore.introducaoclasses.gassociacao.exercise.domain.Seminario;

import java.util.Scanner;

public class AssociacaoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o local do seminário:");
        String localEndereco = input.nextLine();
        Local local1 = new Local(localEndereco);

        System.out.println("Digite o título do seminário:");
        String titulo = input.nextLine();
        Seminario seminario1 = new Seminario(local1, titulo);

        System.out.println("Quantos alunos terá esse seminário?");
        int qtdeAlunos = input.nextInt();
        input.nextLine(); // Necessário, porque o int lê o enter como "\n", quebrando o próximo nextLine.
        Aluno[] alunos = new Aluno[qtdeAlunos];

        if(qtdeAlunos > 0){
            for(int i = 0; i < alunos.length; i++){
                System.out.println("Digite o nome de um aluno:");
                String nomeAluno = input.nextLine();

                System.out.println("Agora digite a idade do aluno " + nomeAluno);
                int idadeAluno = input.nextInt();
                input.nextLine();

                Aluno aluno = new Aluno(nomeAluno, idadeAluno);
                alunos[i] = aluno;
            }
        }

        seminario1.setAlunos(alunos);

        Seminario[] seminariosProf1 = {seminario1};
        Professor professor1 = new Professor("Mateus Silva", "História", seminariosProf1);
        Professor professor2 = new Professor("Gustavo Matos", "Religião");
        Local local2 = new Local("Jardim Paraíso");
        Seminario seminario2 = new Seminario(local2, "Cristianismo no Brasil");
        Seminario[] seminariosProf2 = {seminario1, seminario2};
        professor2.setSeminarios(seminariosProf2);

        seminario1.imprime();
        professor1.imprime();
        professor2.imprime();
    }
}
