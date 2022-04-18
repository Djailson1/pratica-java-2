package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/
public class repeticoes_29_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont, numero;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for (cont = 0; cont <= numero; cont++ ){
            System.out.println(cont);

        }
        System.out.println("FIM!");
    }
}
