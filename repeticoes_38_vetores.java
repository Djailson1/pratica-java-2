package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Random;

/*Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.*/
public class repeticoes_38_vetores {
    public static void main(String[] args) {
        Random random = new Random();
        int sorteia;


        int[] vetor = new int[7];
        int cont;

        for(cont = 0; cont < 7; cont++){

            sorteia = random.nextInt(7);
            vetor[cont] = sorteia;
            System.out.print(sorteia + " ");
        }

    }
}
