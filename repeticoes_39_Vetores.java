package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;
/*Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.*/
public class repeticoes_39_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o nome da " + (i+1) + "° pessoa: ");
            nomes[i] = scan.nextLine();

        }
        for(int i = 6; i >= 0; i--){

            System.out.print(nomes[i] + " ");

        }

    }
}
