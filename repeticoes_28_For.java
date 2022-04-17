package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...*/
public class repeticoes_28_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, i, mult;

        System.out.println("===============");
        System.out.println("    TABUADA    ");
        System.out.println("===============");

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for (i = 1; i <= 10; i++){

            mult = numero * i;
            System.out.println(numero + " X " + i + " = " + mult);

        }


    }
}
