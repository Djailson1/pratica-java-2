package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.*/
public class repeticoes_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3, num4, num5, num6, num7;
        int soma = 0;

        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = scan.nextInt();

        System.out.println("Digite o quarto numero: ");
        num4 = scan.nextInt();

        System.out.println("Digite o quinto numero: ");
        num5 = scan.nextInt();

        System.out.println("Digite o sexto numero: ");
        num6 = scan.nextInt();

        System.out.println("Digite o sétimo numero: ");
        num7 = scan.nextInt();

        soma = (num1 + num2 + num3 + num4 + num5 + num6 + num7);

        System.out.println(" A soma dos 7 números informados é " + " = " + soma);
    }
}
