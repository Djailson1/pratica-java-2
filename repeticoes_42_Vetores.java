package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Random;
import java.util.Scanner;

/*Faça um algoritmo que preencha um vetor de 30 posições
 com números entre 1 e 15 sorteados pelo computador.
 Depois disso, peça para o usuário digitar um número (chave)
 e seu programa deve mostrar em que posições essa chave foi encontrada.
  Mostre também quantas vezes a chave foi sorteada.*/
public class repeticoes_42_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numUsua, quant = 0;
        int[] vetor = new int[30];

        for (int i = 0; i < 30; i++){

            vetor[i] = random.nextInt(15);
        }
        
        System.out.println("Digite um número chave: ");
        numUsua = scan.nextInt();

        System.out.println("O número " + numUsua + " foi encontrado nas posições: ");

        for (int i = 0; i < 30; i++){
            if (numUsua == vetor[i]){
                System.out.print("[" + vetor[i] + "] ");
                quant = quant + 1;
            }else{
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("\n E foi sorteado " + quant +  " vezes.");
    }
}
