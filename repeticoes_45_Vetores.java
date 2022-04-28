package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Random;

/*[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.*/
public class repeticoes_45_Vetores {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[20];
        int numero, C1, aux;

        System.out.println("Os 20 números de 0 a 99 sorteados foram: ");

        for (int C = 0; C < 20; C++){

            vetor[C] = random.nextInt(99);
            System.out.print(vetor[C] + " ");

        }

        System.out.println("\n");

        for (int C = 0; C < 19; C++){
            for (C1 = C + 1; C1 < 20; C1++){
               if (vetor[C] > vetor[C1]){
                  aux = vetor[C];
                  vetor[C] = vetor[C1];
                  vetor[C1] = aux;
               }
            }
        }

        for (int C = 0; C < 20; C++){
            System.out.print(vetor[C] + " ");
        }

    }
}
