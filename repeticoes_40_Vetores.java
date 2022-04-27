package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Escreva um programa que leia 15 números e guarde-os em um vetor.
No final, mostre o vetor inteiro na tela e em seguida mostre em que
posições foram digitados valores que são múltiplos de 10.*/
public class repeticoes_40_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] numeros = new int[15];


        for(int i = 0; i < 15; i++){

            System.out.println("Digite o " + (i+1)+  "° número: ");
            numeros[i] = scan.nextInt();

        }

        for(int i = 0; i < 15; i++){

            if(numeros[i] % 10 == 0){

                System.out.print("[" + numeros[i] + "] ");


            }else{
                System.out.print(numeros[i] + " ");
            }

        }
    }
}
