package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.*/
public class repeticoes_11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;//variáveis

        for(int i = 1; i <= 6; i++){
            System.out.println("Digite o " + i + "º número");
            num = ent.nextInt();// laço for que vai ser repetido 6 vezes armazenando o resultado na variável.

            if(num % 2 == 0){
                contPar++;//conta a quantidade de números par.
            }

            // para informar números impares

            if(num % 2 == 1){
                contImpar++;//conta a quantidade de números ímpar.
            }

        }

        System.out.println("Foram digitados " + contPar + " números pares \n");
        System.out.println("E " + contImpar + " números ímpares");
    }
}
