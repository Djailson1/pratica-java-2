package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um programa que leia 10 números inteiros e guarde-os em
 um vetor. No final, mostre quais são os números pares que foram
 digitados e em que posições eles estão armazenados.*/
public class repeticoes_41_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] numeros = new int[10];


        for(int i = 0; i < 10; i++){

            System.out.println("Digite o " + (i+1)+  "° número: ");
            numeros[i] = scan.nextInt();

        }

        for(int i = 0; i < 10; i++){

            if(numeros[i] % 2 == 0){

                System.out.print("[" + numeros[i] + "] ");


            }else{
                System.out.print(numeros[i] + " ");
            }

        }

    }
}
