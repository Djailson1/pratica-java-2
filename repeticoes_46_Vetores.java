package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.*/
public class repeticoes_46_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] nome = new char[9];
        char[] nomeM = new char[9];
        int[] idade = new int[9];
        int[] idadeM = new int[9];

        char N, menor;
        int C, I, menorI;


        for ( C = 0; C < 9; C++){
            System.out.println("Digite o nome da " + (C+1) + "° pessoa: ");
            N = scan.next().charAt(0);
            nome[C] = N;

            System.out.println("Digite a idade da " + (C+1) + "° pessoa: ");
            I = scan.nextInt();
            idade[C] = I;
            if (idade[C] < 18){
                nomeM[C] = nome[C];
                idadeM[C] = idade[C];
            }

        }
        for (C = 0; C < 9; C++){
            if (idadeM[C] > 0){
                System.out.println("Nome: " + nomeM[C] + " Idade: " + idadeM[C] + " anos.");
            }
        }
    }
}
