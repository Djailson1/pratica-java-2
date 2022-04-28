package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade*/
public class repeticoes_43_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[]vetor = new int[8];
        int[]posicao = new int[8];
        int[]maior25 = new int[8];

        int C,idade, totalIdade = 0, pmaiorIdade = 0;

        double media, maiorId = 0;

        for(C = 0; C < 8; C++){
            System.out.println("Digite a " + (C+1) + "° idade: ");
            idade = scan.nextInt();

            totalIdade = totalIdade + idade;
            vetor[C] = idade;
            posicao[C] = C;

            if(vetor[C] > 25){

                maior25[C] = posicao[C];

            }
            if(vetor[C] > maiorId){

                maiorId = vetor[C];
                pmaiorIdade = posicao[C];

            }



        }
        media = totalIdade / 8;

        System.out.println("A média das idades cadastradas é " + media + " " );

        System.out.println("A pessoas com mais de 25 anos estão nas posições: ");

        for(C = 0; C < 8 ; C++){

            if(maior25[C] > 0){

                System.out.print(maior25[C] + " ");
            }
        }

        System.out.println("\nA maior idade digitada foi " + maiorId);
        System.out.println("A maior idade foi digitada na posição: " + pmaiorIdade);
    }
    }

