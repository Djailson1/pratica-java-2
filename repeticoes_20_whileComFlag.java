package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.*/
public class repeticoes_20_whileComFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, totalAlunos = 0, somaIdade = 0, mediaIdade = 0, cont = 0, prox = 1;


        while(cont < prox){

            System.out.println("Digite a idade do " + prox + "° aluno: ");
            idade = scan.nextInt();

            System.out.println("---------------------------------------------");

            prox = prox + 1;

            totalAlunos = totalAlunos + 1;

            somaIdade = somaIdade + idade;


            if (idade == 999){

                somaIdade = somaIdade - 999;
                totalAlunos = totalAlunos - 1;
                mediaIdade = (somaIdade) / totalAlunos;
                break;

            }



            cont++;
        }
        System.out.println("A quantidade de alunos é de: " + totalAlunos + " alunos.");
        System.out.println("A média de idade dos alunos é de: " + mediaIdade + " anos.");

    }
}